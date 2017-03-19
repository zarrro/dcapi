package clinic.dermal.model.payment;

import java.util.List;

public class Payer {
	/**
	 * Payment method being used - PayPal Wallet payment, Bank Direct Debit  or Direct Credit card.
	 */
	private String paymentMethod;
	/**
	 * Status of payer's PayPal Account.
	 */
	private String status;
	/**
	 * Type of account relationship payer has with PayPal.
	 */
	private String accountType;
	/**
	 * Duration since the payer established account relationship with PayPal in days.
	 */
	private String accountAge;
	/**
	 * List of funding instruments to fund the payment. 'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	private List<FundingInstrument> fundingInstruments;
	/**
	 * Id of user selected funding option for the payment.'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	private String fundingOptionId;
	/**
	 * Default funding option available for the payment
	 */
	@Deprecated
	private FundingOption fundingOption;
	/**
	 * Instrument type pre-selected by the user outside of PayPal and passed along the payment creation. This param is used in cases such as PayPal Credit Second Button
	 */
	private String externalSelectedFundingInstrumentType;
	/**
	 * Funding option related to default funding option.
	 */
	private FundingOption relatedFundingOption;
	/**
	 * Information related to the Payer.
	 */
	private PayerInfo payerInfo;

	/**
	 * Default Constructor
	 */
	public Payer() {
	}

	/**
	 * Payment method being used - PayPal Wallet payment, Bank Direct Debit  or Direct Credit card.
	 */
	@java.lang.SuppressWarnings("all")
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 * Status of payer's PayPal Account.
	 */
	@java.lang.SuppressWarnings("all")
	public String getStatus() {
		return this.status;
	}

	/**
	 * Type of account relationship payer has with PayPal.
	 */
	@java.lang.SuppressWarnings("all")
	public String getAccountType() {
		return this.accountType;
	}

	/**
	 * Duration since the payer established account relationship with PayPal in days.
	 */
	@java.lang.SuppressWarnings("all")
	public String getAccountAge() {
		return this.accountAge;
	}

	/**
	 * List of funding instruments to fund the payment. 'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	@java.lang.SuppressWarnings("all")
	public List<FundingInstrument> getFundingInstruments() {
		return this.fundingInstruments;
	}

	/**
	 * Id of user selected funding option for the payment.'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	@java.lang.SuppressWarnings("all")
	public String getFundingOptionId() {
		return this.fundingOptionId;
	}

	/**
	 * Default funding option available for the payment
	 */
	@java.lang.Deprecated
	@java.lang.SuppressWarnings("all")
	public FundingOption getFundingOption() {
		return this.fundingOption;
	}

	/**
	 * Instrument type pre-selected by the user outside of PayPal and passed along the payment creation. This param is used in cases such as PayPal Credit Second Button
	 */
	@java.lang.SuppressWarnings("all")
	public String getExternalSelectedFundingInstrumentType() {
		return this.externalSelectedFundingInstrumentType;
	}

	/**
	 * Funding option related to default funding option.
	 */
	@java.lang.SuppressWarnings("all")
	public FundingOption getRelatedFundingOption() {
		return this.relatedFundingOption;
	}

	/**
	 * Information related to the Payer.
	 */
	@java.lang.SuppressWarnings("all")
	public PayerInfo getPayerInfo() {
		return this.payerInfo;
	}

	/**
	 * Payment method being used - PayPal Wallet payment, Bank Direct Debit  or Direct Credit card.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setPaymentMethod(final String paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	/**
	 * Status of payer's PayPal Account.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setStatus(final String status) {
		this.status = status;
		return this;
	}

	/**
	 * Type of account relationship payer has with PayPal.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setAccountType(final String accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Duration since the payer established account relationship with PayPal in days.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setAccountAge(final String accountAge) {
		this.accountAge = accountAge;
		return this;
	}

	/**
	 * List of funding instruments to fund the payment. 'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setFundingInstruments(final List<FundingInstrument> fundingInstruments) {
		this.fundingInstruments = fundingInstruments;
		return this;
	}

	/**
	 * Id of user selected funding option for the payment.'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setFundingOptionId(final String fundingOptionId) {
		this.fundingOptionId = fundingOptionId;
		return this;
	}

	/**
	 * Default funding option available for the payment
	 * @return this
	 */
	@java.lang.Deprecated
	@java.lang.SuppressWarnings("all")
	public Payer setFundingOption(final FundingOption fundingOption) {
		this.fundingOption = fundingOption;
		return this;
	}

	/**
	 * Instrument type pre-selected by the user outside of PayPal and passed along the payment creation. This param is used in cases such as PayPal Credit Second Button
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setExternalSelectedFundingInstrumentType(final String externalSelectedFundingInstrumentType) {
		this.externalSelectedFundingInstrumentType = externalSelectedFundingInstrumentType;
		return this;
	}

	/**
	 * Funding option related to default funding option.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setRelatedFundingOption(final FundingOption relatedFundingOption) {
		this.relatedFundingOption = relatedFundingOption;
		return this;
	}

	/**
	 * Information related to the Payer.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payer setPayerInfo(final PayerInfo payerInfo) {
		this.payerInfo = payerInfo;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Payer)) return false;
		final Payer other = (Payer) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$paymentMethod = this.getPaymentMethod();
		final java.lang.Object other$paymentMethod = other.getPaymentMethod();
		if (this$paymentMethod == null ? other$paymentMethod != null : !this$paymentMethod.equals(other$paymentMethod)) return false;
		final java.lang.Object this$status = this.getStatus();
		final java.lang.Object other$status = other.getStatus();
		if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
		final java.lang.Object this$accountType = this.getAccountType();
		final java.lang.Object other$accountType = other.getAccountType();
		if (this$accountType == null ? other$accountType != null : !this$accountType.equals(other$accountType)) return false;
		final java.lang.Object this$accountAge = this.getAccountAge();
		final java.lang.Object other$accountAge = other.getAccountAge();
		if (this$accountAge == null ? other$accountAge != null : !this$accountAge.equals(other$accountAge)) return false;
		final java.lang.Object this$fundingInstruments = this.getFundingInstruments();
		final java.lang.Object other$fundingInstruments = other.getFundingInstruments();
		if (this$fundingInstruments == null ? other$fundingInstruments != null : !this$fundingInstruments.equals(other$fundingInstruments)) return false;
		final java.lang.Object this$fundingOptionId = this.getFundingOptionId();
		final java.lang.Object other$fundingOptionId = other.getFundingOptionId();
		if (this$fundingOptionId == null ? other$fundingOptionId != null : !this$fundingOptionId.equals(other$fundingOptionId)) return false;
		final java.lang.Object this$fundingOption = this.getFundingOption();
		final java.lang.Object other$fundingOption = other.getFundingOption();
		if (this$fundingOption == null ? other$fundingOption != null : !this$fundingOption.equals(other$fundingOption)) return false;
		final java.lang.Object this$externalSelectedFundingInstrumentType = this.getExternalSelectedFundingInstrumentType();
		final java.lang.Object other$externalSelectedFundingInstrumentType = other.getExternalSelectedFundingInstrumentType();
		if (this$externalSelectedFundingInstrumentType == null ? other$externalSelectedFundingInstrumentType != null : !this$externalSelectedFundingInstrumentType.equals(other$externalSelectedFundingInstrumentType)) return false;
		final java.lang.Object this$relatedFundingOption = this.getRelatedFundingOption();
		final java.lang.Object other$relatedFundingOption = other.getRelatedFundingOption();
		if (this$relatedFundingOption == null ? other$relatedFundingOption != null : !this$relatedFundingOption.equals(other$relatedFundingOption)) return false;
		final java.lang.Object this$payerInfo = this.getPayerInfo();
		final java.lang.Object other$payerInfo = other.getPayerInfo();
		if (this$payerInfo == null ? other$payerInfo != null : !this$payerInfo.equals(other$payerInfo)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Payer;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $paymentMethod = this.getPaymentMethod();
		result = result * PRIME + ($paymentMethod == null ? 43 : $paymentMethod.hashCode());
		final java.lang.Object $status = this.getStatus();
		result = result * PRIME + ($status == null ? 43 : $status.hashCode());
		final java.lang.Object $accountType = this.getAccountType();
		result = result * PRIME + ($accountType == null ? 43 : $accountType.hashCode());
		final java.lang.Object $accountAge = this.getAccountAge();
		result = result * PRIME + ($accountAge == null ? 43 : $accountAge.hashCode());
		final java.lang.Object $fundingInstruments = this.getFundingInstruments();
		result = result * PRIME + ($fundingInstruments == null ? 43 : $fundingInstruments.hashCode());
		final java.lang.Object $fundingOptionId = this.getFundingOptionId();
		result = result * PRIME + ($fundingOptionId == null ? 43 : $fundingOptionId.hashCode());
		final java.lang.Object $fundingOption = this.getFundingOption();
		result = result * PRIME + ($fundingOption == null ? 43 : $fundingOption.hashCode());
		final java.lang.Object $externalSelectedFundingInstrumentType = this.getExternalSelectedFundingInstrumentType();
		result = result * PRIME + ($externalSelectedFundingInstrumentType == null ? 43 : $externalSelectedFundingInstrumentType.hashCode());
		final java.lang.Object $relatedFundingOption = this.getRelatedFundingOption();
		result = result * PRIME + ($relatedFundingOption == null ? 43 : $relatedFundingOption.hashCode());
		final java.lang.Object $payerInfo = this.getPayerInfo();
		result = result * PRIME + ($payerInfo == null ? 43 : $payerInfo.hashCode());
		return result;
	}
}