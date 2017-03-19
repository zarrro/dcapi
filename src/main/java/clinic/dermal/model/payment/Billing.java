package clinic.dermal.model.payment;

public class Billing {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String billingAgreementId;

	/**
	 * Selected installment option for issuer based installments (BR and MX).
	 */
	private InstallmentOption selectedInstallmentOption;

	/**
	 * Default Constructor
	 */
	public Billing() {
	}

	public String getBillingAgreementId() {
		return billingAgreementId;
	}

	public void setBillingAgreementId(String billingAgreementId) {
		this.billingAgreementId = billingAgreementId;
	}

	public InstallmentOption getSelectedInstallmentOption() {
		return selectedInstallmentOption;
	}

	public void setSelectedInstallmentOption(InstallmentOption selectedInstallmentOption) {
		this.selectedInstallmentOption = selectedInstallmentOption;
	}
	

}
