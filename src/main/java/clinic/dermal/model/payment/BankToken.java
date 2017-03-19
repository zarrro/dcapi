package clinic.dermal.model.payment;

public class BankToken {

	/**
	 * ID of a previously saved Bank resource using /vault/bank API.
	 */
	private String bankId;

	/**
	 * The unique identifier of the payer used when saving this bank using /vault/bank API.
	 */
	private String externalCustomerId;

	/**
	 * Identifier of the direct debit mandate to validate. Currently supported only for EU bank accounts(SEPA).
	 */
	private String mandateReferenceNumber;

	/**
	 * Default Constructor
	 */
	public BankToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BankToken(String bankId, String externalCustomerId) {
		this.bankId = bankId;
		this.externalCustomerId = externalCustomerId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getExternalCustomerId() {
		return externalCustomerId;
	}

	public void setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
	}

	public String getMandateReferenceNumber() {
		return mandateReferenceNumber;
	}

	public void setMandateReferenceNumber(String mandateReferenceNumber) {
		this.mandateReferenceNumber = mandateReferenceNumber;
	}
}
