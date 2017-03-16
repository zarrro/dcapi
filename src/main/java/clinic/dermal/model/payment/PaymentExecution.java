package clinic.dermal.model.payment;

public class PaymentExecution {

	private String payer_id;

	public String getPayer_id() {
		return payer_id;
	}

	public void setPayer_id(String payer_id) {
		this.payer_id = payer_id;
	}

	@Override
	public String toString() {
		return "PaymentExecution [payer_id=" + payer_id + "]";
	}
}
