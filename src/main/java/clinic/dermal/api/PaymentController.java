package clinic.dermal.api;

import java.util.Arrays;
import java.util.Base64;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Item;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;

import clinic.dermal.model.payment.BearerToken;
import clinic.dermal.model.payment.CheckoutOnAuthorizeData;
import clinic.dermal.model.payment.CreatePaymentResult;
import clinic.dermal.model.payment.PaymentExecution;

@RestController
public class PaymentController {

	private String _accessToken;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	String getAccessToken(RestTemplate restTemplate) {
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

		System.out.println(">>> Access token aquired: " + tokenInfo.getAccess_token());
		return tokenInfo.getAccess_token();
	}

	@PostMapping("/payment")
	public ResponseEntity<CreatePaymentResult> createPayment(RestTemplate restTemplate) {
		_accessToken = getAccessToken(restTemplate);

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
		tran.setInvoiceNumber("9000291");
		tran.setCustom("Dermal.Clinic worldwide trust");

		paymentRequest.setTransactions(Arrays.asList(new Transaction[] { tran }));

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Bearer " + _accessToken);

		HttpEntity<String> requestEntity = new HttpEntity<String>(paymentRequest.toJSON(), headers);

		System.out.println(">>>>>> " + paymentRequest.toJSON());

		Payment paymentResult = restTemplate.postForObject("https://api.sandbox.paypal.com/v1/payments/payment",
				requestEntity, Payment.class);

		System.out.println("!!!!!! " + paymentResult.toJSON());

		return new ResponseEntity<CreatePaymentResult>(new CreatePaymentResult(paymentResult.getId()),
				HttpStatus.CREATED);
	}

	@PostMapping("/payment-execute")
	public ResponseEntity<Payment> executePayment(RestTemplate restTemplate, String paymentID, String payerID) {

		if (payerID == null || payerID.isEmpty())
			throw new IllegalArgumentException("payerID");
		if (paymentID == null || paymentID.isEmpty())
			throw new IllegalArgumentException("paymentID");

		System.out.println("------ executePayment - data: " + paymentID + ", payerID: " + payerID);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Authorization", "Bearer " + _accessToken);

		PaymentExecution pe = new PaymentExecution();
		pe.setPayer_id(payerID);

		HttpEntity<PaymentExecution> requestEntity = new HttpEntity<PaymentExecution>(pe, headers);

		Payment paymentResult = restTemplate.postForObject(
				"https://api.sandbox.paypal.com/v1/payments/payment/" + paymentID + "/execute/", requestEntity,
				Payment.class);

		System.out.println("------ Payment execution result: " + paymentResult.toJSON());

		return new ResponseEntity<Payment>(paymentResult, HttpStatus.CREATED);
	}
}
