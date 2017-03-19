package clinic.dermal.model.payment;

public class ExtendedBankAccount {

	/**
	 * Identifier of the direct debit mandate to validate. Currently supported only for EU bank accounts(SEPA).
	 */
	private String mandateReferenceNumber;

	/**
	 * Default Constructor
	 */
	public ExtendedBankAccount() {
	}

	public String getMandateReferenceNumber() {
		return mandateReferenceNumber;
	}

	public void setMandateReferenceNumber(String mandateReferenceNumber) {
		this.mandateReferenceNumber = mandateReferenceNumber;
	}	
}
