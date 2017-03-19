package clinic.dermal.model.payment;

public class ExternalFunding {

	/**
	 * Unique identifier for the external funding
	 */
	private String referenceId;

	/**
	 * Generic identifier for the external funding
	 */
	private String code;

	/**
	 * Encrypted PayPal Account identifier for the funding account
	 */
	private String fundingAccountId;

	/**
	 * Description of the external funding being applied
	 */
	private String displayText;

	/**
	 * Amount being funded by the external funding account
	 */
	private Amount amount;

	/**
	 * Indicates that the Payment should be fully funded by External Funded Incentive
	 */
	private String fundingInstruction;

	/**
	 * Default Constructor
	 */
	public ExternalFunding() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ExternalFunding(String referenceId, String fundingAccountId, Amount amount) {
		this.referenceId = referenceId;
		this.fundingAccountId = fundingAccountId;
		this.amount = amount;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFundingAccountId() {
		return fundingAccountId;
	}

	public void setFundingAccountId(String fundingAccountId) {
		this.fundingAccountId = fundingAccountId;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getFundingInstruction() {
		return fundingInstruction;
	}

	public void setFundingInstruction(String fundingInstruction) {
		this.fundingInstruction = fundingInstruction;
	}
}
