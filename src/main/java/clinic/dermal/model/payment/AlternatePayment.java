package clinic.dermal.model.payment;

public class AlternatePayment {

	/**
	 * The unique identifier of the alternate payment account.
	 */
	private String alternatePaymentAccountId;

	/**
	 * The unique identifier of the payer
	 */
	private String externalCustomerId;

	/**
	 * Alternate Payment provider id. This is an optional attribute needed only for certain alternate providers e.g Ideal
	 */
	private String alternatePaymentProviderId;

	/**
	 * Default Constructor
	 */
	public AlternatePayment() {
	}

	/**
	 * Parameterized Constructor
	 */
	public AlternatePayment(String alternatePaymentAccountId) {
		this.alternatePaymentAccountId = alternatePaymentAccountId;
	}

	public String getAlternatePaymentAccountId() {
		return alternatePaymentAccountId;
	}

	public void setAlternatePaymentAccountId(String alternatePaymentAccountId) {
		this.alternatePaymentAccountId = alternatePaymentAccountId;
	}

	public String getExternalCustomerId() {
		return externalCustomerId;
	}

	public void setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
	}

	public String getAlternatePaymentProviderId() {
		return alternatePaymentProviderId;
	}

	public void setAlternatePaymentProviderId(String alternatePaymentProviderId) {
		this.alternatePaymentProviderId = alternatePaymentProviderId;
	}
}
