package clinic.dermal.model.payment;

public class RedirectUrls {

	/**
	 * Url where the payer would be redirected to after approving the payment. **Required for PayPal account payments.**
	 */
	private String returnUrl;

	/**
	 * Url where the payer would be redirected to after canceling the payment. **Required for PayPal account payments.**
	 */
	private String cancelUrl;

	/**
	 * Default Constructor
	 */
	public RedirectUrls() {
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getCancelUrl() {
		return cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}
}
