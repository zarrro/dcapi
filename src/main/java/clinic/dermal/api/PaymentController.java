package clinic.dermal.api;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import clinic.dermal.logic.DcMailSender;
import clinic.dermal.logic.StorageService;
import clinic.dermal.model.Case;
import clinic.dermal.model.PaymentException;
import clinic.dermal.model.Survey;
import clinic.dermal.model.payment.Amount;
import clinic.dermal.model.payment.BearerToken;
import clinic.dermal.model.payment.CreatePaymentResult;
import clinic.dermal.model.payment.Item;
import clinic.dermal.model.payment.ItemList;
import clinic.dermal.model.payment.Payer;
import clinic.dermal.model.payment.Payment;
import clinic.dermal.model.payment.PaymentExecution;
import clinic.dermal.model.payment.RedirectUrls;
import clinic.dermal.model.payment.Transaction;
import clinic.dermal.persistence.Counter;
import clinic.dermal.util.JSONFormatter;

@RestController
public class PaymentController {

	private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);

	private String _accessToken;

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private StorageService storageService;

	@Autowired
	private DcMailSender mailSender;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	private ObjectMapper mapper;
	private ObjectMapper mapperPretty;
	
	PaymentController() {
		this.mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);

		this.mapperPretty = new ObjectMapper();
		mapperPretty.setSerializationInclusion(Include.NON_NULL);
		mapperPretty.enable(SerializationFeature.INDENT_OUTPUT);
	}
	

	@PostMapping("/payment")
	public ResponseEntity<CreatePaymentResult> createPayment() {
		_accessToken = getAccessToken(restTemplate);

		Payment paymentResult = null;

		HttpEntity<String> requestEntity = createHttpPaymentRequest(createPaymentEntity());

		paymentResult = this.restTemplate.postForObject("https://api.sandbox.paypal.com/v1/payments/payment", requestEntity,
				Payment.class);

		if (paymentResult.getId() == null) {
			throw new PaymentException("Create payment doesn't contain paymentId");
		}
		
		LOG.info("Create payment response:\n" + toJson(paymentResult));

		return new ResponseEntity<CreatePaymentResult>(new CreatePaymentResult(paymentResult.getId()),
				HttpStatus.CREATED);
	}

	@PostMapping("/payment-execute")
	public ResponseEntity<String> sendCaseForReview(
			@RequestPart("image1") MultipartFile image1, @RequestPart("image2") MultipartFile image2,
			@RequestParam("survey") String surveyJson, @RequestPart("payerId") String payerId,
			@RequestPart("paymentId") String paymentId) {

		if (paymentId == null || paymentId.isEmpty()) {
			throw new IllegalArgumentException("paymentId is empty");
		}
		if (payerId == null || payerId.isEmpty()) {
			throw new IllegalArgumentException("payerId is empty");
		}
		if (image1 == null) {
			throw new IllegalArgumentException("image1 is null");
		}
		if (image2 == null) {
			throw new IllegalArgumentException("image2 is null");
		}
		if (surveyJson == null) {
			throw new IllegalArgumentException("surveyJson is null");
		}

		String paymentResult = executePayment(payerId, paymentId);
		
		Case c = createCaseFromRequestData(image1, image2, surveyJson, payerId, paymentId);
		
		this.mailSender.sendNewCaseForReview(c);

		return new ResponseEntity<String>(paymentResult, HttpStatus.CREATED);
	}

	private String executePayment(String payerId, String paymentId) {
		LOG.info("executePayment invoked - paymentId: {}, payerId: {}", paymentId, payerId);

		if (payerId == null || payerId.isEmpty())
			throw new IllegalArgumentException("payerID");
		if (paymentId == null || paymentId.isEmpty())
			throw new IllegalArgumentException("paymentID");

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Bearer " + _accessToken);

		PaymentExecution pe = new PaymentExecution();
		pe.setPayer_id(payerId);
		HttpEntity<PaymentExecution> requestEntity = new HttpEntity<PaymentExecution>(pe, headers);

		final String paymentUrl = "https://api.sandbox.paypal.com/v1/payments/payment/" + paymentId + "/execute/";
		LOG.info("Request:\n {}\nURL: {}", pe, paymentUrl);

		String paymentResult = this.restTemplate.postForObject(paymentUrl, requestEntity, String.class);
		//TODO: validate approved state here
		LOG.info("Response:\n" + paymentResult);
		return paymentResult;
	}
	
	private Case createCaseFromRequestData(MultipartFile image1, MultipartFile image2, String surveyJson, String payerId, String paymentId) {
		LOG.info("createCaseFromRequestData invoked");
		Case c = new Case();
		c.setPaymentId(paymentId);
		c.setPayerId(payerId);
		
		File imageFile1 = storageService.store(image1, paymentId, "img1_" + image1.getOriginalFilename());
		c.setImage1(imageFile1);
		
		File imageFile2 = storageService.store(image2, paymentId, "img2_" + image2.getOriginalFilename());
		c.setImage2(imageFile2);

		Survey s = null;
		try {
			s = new ObjectMapper().readValue(surveyJson, Survey.class);
			LOG.info(surveyJson);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		c.setSurvey(s);
		return c;
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

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");
		paymentRequest.setPayer(payer);

		Transaction tran = new Transaction();

		Amount amount = new Amount("EUR", "20.00");
		tran.setAmount(amount);

		RedirectUrls redirect = new RedirectUrls();
		redirect.setReturnUrl("http://localhost:5555/result/redirected-success");
		redirect.setCancelUrl("http://localhost:5555/result/redirected-cancel");
		paymentRequest.setRedirectUrls(redirect);
		
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
		HttpEntity<String> requestEntity = new HttpEntity<String>(toJson(payment), headers);

		LOG.info("Create payment request:\n" + toJson(payment));
		return requestEntity;
	}
	
	private static String toJson(Object o) {
		return JSONFormatter.toJSON(o); 
	}
}
