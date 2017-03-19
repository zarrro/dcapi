package clinic.dermal.model.payment;

public class PaymentOptions {

	/**
	 * Payment method requested for this purchase unit
	 */
	private String allowedPaymentMethod;

	/**
	 * Indicator if this payment request is a recurring payment. Only supported when the `payment_method` is set to `credit_card`
	 */
	private Boolean recurringFlag;

	/**
	 * Indicator if fraud management filters (fmf) should be skipped for this transaction. Only supported when the `payment_method` is set to `credit_card`
	 */
	private Boolean skipFmf;

	/**
	 * Default Constructor
	 */
	public PaymentOptions() {
	}

	public String getAllowedPaymentMethod() {
		return allowedPaymentMethod;
	}

	public void setAllowedPaymentMethod(String allowedPaymentMethod) {
		this.allowedPaymentMethod = allowedPaymentMethod;
	}

	public Boolean getRecurringFlag() {
		return recurringFlag;
	}

	public void setRecurringFlag(Boolean recurringFlag) {
		this.recurringFlag = recurringFlag;
	}

	public Boolean getSkipFmf() {
		return skipFmf;
	}

	public void setSkipFmf(Boolean skipFmf) {
		this.skipFmf = skipFmf;
	}
}
