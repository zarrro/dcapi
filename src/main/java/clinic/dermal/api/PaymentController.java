package clinic.dermal.api;

import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Item;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;

import clinic.dermal.logic.EmailSenderService;
import clinic.dermal.model.Case;
import clinic.dermal.model.PaymentException;
import clinic.dermal.model.payment.BearerToken;
import clinic.dermal.model.payment.CreatePaymentResult;
import clinic.dermal.model.payment.PaymentExecution;
import clinic.dermal.persistence.CaseRepository;
import clinic.dermal.persistence.Counter;

@RestController
public class PaymentController {

	private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);

	private String _accessToken;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private CaseRepository caseRepo;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@PostMapping("/payment")
	public ResponseEntity<CreatePaymentResult> createPayment(RestTemplate restTemplate) {
		_accessToken = getAccessToken(restTemplate);

		final Case newCase = createCase();
		newCase.setState(Case.State.CREATE_PAYMENT_INITIATED);

		Payment paymentResult = null;
		try {
			HttpEntity<String> requestEntity = createHttpPaymentRequest(createPaymentEntity());

			paymentResult = restTemplate.postForObject("https://api.sandbox.paypal.com/v1/payments/payment",
					requestEntity, Payment.class);

			if (paymentResult.getId() == null) {
				throw new PaymentException("Create payment doesn't contain paymentId");
			}
			newCase.setState(Case.State.PAYMENT_CREATED);
			newCase.setPaymentId(paymentResult.getId());
			LOG.info("Create payment response:\n" + paymentResult.toJSON());
		} finally {
			this.caseRepo.save(newCase);
		}
		return new ResponseEntity<CreatePaymentResult>(new CreatePaymentResult(paymentResult.getId()),
				HttpStatus.CREATED);
	}

	@PostMapping("/payment-execute")
	public ResponseEntity<String> executePayment(RestTemplate restTemplate, String paymentID, String payerID) {
		LOG.info("executePayment invoked - paymentID: {}, payerID: {}", paymentID, payerID);

		if (payerID == null || payerID.isEmpty())
			throw new IllegalArgumentException("payerID");
		if (paymentID == null || paymentID.isEmpty())
			throw new IllegalArgumentException("paymentID");

		final Case c = this.caseRepo.findByPaymentId(paymentID);

		if (c == null) {
			throw new IllegalArgumentException("PaymentId doesn't exists");
		}
		if (!c.getState().equals(Case.State.PAYMENT_CREATED)
				&& c.getState().equals(Case.State.AUTHORIZE_PAYMENT_INITIATED)) {
			throw new IllegalStateException("PaymentId " + paymentID + " state is " + c.getState());
		}

		c.setState(Case.State.AUTHORIZE_PAYMENT_INITIATED);
		String paymentResult = null;
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", "application/json");
			headers.set("Authorization", "Bearer " + _accessToken);

			PaymentExecution pe = new PaymentExecution();
			pe.setPayer_id(payerID);

			HttpEntity<PaymentExecution> requestEntity = new HttpEntity<PaymentExecution>(pe, headers);

			final String paymentUrl = "https://api.sandbox.paypal.com/v1/payments/payment/" + paymentID + "/execute/";
			LOG.info("Request:\n {}\nURL: {}", pe, paymentUrl);

			paymentResult = restTemplate.postForObject(paymentUrl, requestEntity, String.class);
			// TODO: deserialize the payment result and check if the state is
			// approved
			// set the case status accordingly
			c.setState(Case.State.PAYMENT_AUTHORIZED);
		} finally {
			this.caseRepo.save(c);
		}
		System.out.println("Response: " + paymentResult);

		return new ResponseEntity<String>(paymentResult, HttpStatus.CREATED);
	}

	/**
	 * Gets new access token.
	 * 
	 * @param restTemplate
	 * @return - bearer access token as string
	 */
	private static String getAccessToken(RestTemplate restTemplate) {
		final String creds = "AYJDB6VRfkdCzRTsQcgSOMlLdHpNdHX2shweNLoxbAKvVaJaxigN8PbROYu12cEnibCqP75uv2Scoien:"
				+ "EBxEViEGiBijbPHLKpkBoHLnYGeAvLuxSydxFTO3T-G6jBhIdHiXL9f6pRj-o2-UVm46r5QbP2j-tb86";
		final String encodedCreds = new String(Base64.getEncoder().encode(creds.getBytes()));

		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Basic " + encodedCreds);
		headers.set("Accept", "application/json");
		headers.set("Content-Type", "application/x-www-form-urlencoded");
		headers.set("Accept-Language", "en_US");

		HttpEntity<String> httpEntity = new HttpEntity<>("grant_type=client_credentials", headers);

		BearerToken tokenInfo = restTemplate.postForObject("https://api.sandbox.paypal.com/v1/oauth2/token", httpEntity,
				BearerToken.class);

		final String tokenString = tokenInfo.getAccess_token();
		LOG.info("Aquired access token: " + tokenString);
		return tokenString;
	}

	/**
	 * @return next invoice ID, six digits padded with leading zeroes.
	 */
	private String getNextInvoiceId() {
		Query query = new Query(Criteria.where("_id").is("invoiceSeq"));
		Update update = new Update().inc("seq", 1);
		Counter c = mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true).upsert(true),
				Counter.class);

		String invoiceId = String.format("%06d", c.getSeq());
		LOG.info("getNextInvoiceId result:" + c.getSeq());
		return invoiceId;
	}

	private Payment createPaymentEntity() {
		Payment paymentRequest = new Payment();
		paymentRequest.setIntent("sale");
		paymentRequest.setExperienceProfileId("XP-YHUZ-5UUG-EPS4-LG43");

		RedirectUrls redirect = new RedirectUrls();
		redirect.setReturnUrl("http://localhost:5555/result/redirected-success");
		redirect.setCancelUrl("http://localhost:5555/result/redirected-cancel");
		paymentRequest.setRedirectUrls(redirect);

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");
		paymentRequest.setPayer(payer);

		Transaction tran = new Transaction();

		Amount amount = new Amount("EUR", "20.00");
		tran.setAmount(amount);

		ItemList itemList = new ItemList();
		Item item = new Item();
		item.setDescription("Dermatologist Fee");
		item.setName("Dermatologist Fee");
		item.setCurrency("EUR");
		item.setPrice("20.00");
		item.setQuantity("1");
		itemList.setItems(Arrays.asList(new Item[] { item }));
		tran.setItemList(itemList);
		tran.setDescription("Dermatoligist fee for review of dermal issue");
		tran.setInvoiceNumber(getNextInvoiceId());
		tran.setCustom("Dermal.Clinic worldwide trust");

		paymentRequest.setTransactions(Arrays.asList(new Transaction[] { tran }));
		return paymentRequest;
	}

	private HttpEntity<String> createHttpPaymentRequest(Payment payment) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Bearer " + _accessToken);
		HttpEntity<String> requestEntity = new HttpEntity<String>(payment.toJSON(), headers);

		LOG.info("Create payment request:\n" + payment.toJSON());
		return requestEntity;
	}

	private Case createCase() {
		return new Case(UUID.randomUUID().toString());
	}
}
