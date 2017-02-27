package clinic.dermal.model.payment;

/**
 * 
 * @author zaro
 *
 *         Handles the onAuthorize call from checkout.js button.
 * 
 */
public class CheckoutOnAuthorizeData {

	private String paymentID;
	private String payerID;

	public String getPayerID() {
		return payerID;
	}

	public void setPayerID(String payerID) {
		this.payerID = payerID;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	@Override
	public String toString() {
		return "CheckoutOnAuthorizeData [paymentID=" + paymentID + ", payerID=" + payerID + "]";
	}
}
