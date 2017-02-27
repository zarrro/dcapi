package clinic.dermal.model.payment;

public class CreatePaymentResult {
	
	private final String paymentId;
	
	public CreatePaymentResult(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentId() {
		return paymentId;
	}
}
