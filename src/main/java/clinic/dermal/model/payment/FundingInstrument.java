package clinic.dermal.model.payment;

public class FundingInstrument {

	/**
	 * Credit Card instrument.
	 */
	private CreditCard creditCard;

	/**
	 * PayPal vaulted credit Card instrument.
	 */
	private CreditCardToken creditCardToken;

	/**
	 * Payment Card information.
	 */
	private PaymentCard paymentCard;

	/**
	 * Bank Account information.
	 */
	private ExtendedBankAccount bankAccount;

	/**
	 * Vaulted bank account instrument.
	 */
	private BankToken bankAccountToken;

	/**
	 * PayPal credit funding instrument.
	 */
	private Credit credit;

	/**
	 * Incentive funding instrument.
	 */
	private Incentive incentive;

	/**
	 * External funding instrument.
	 */
	private ExternalFunding externalFunding;

	/**
	 * Carrier account token instrument.
	 */
	private CarrierAccountToken carrierAccountToken;

	/**
	 * Billing instrument that references pre-approval information for the payment
	 */
	private Billing billing;

	/**
	 * Alternate Payment  information - Mostly regional payment providers. For e.g iDEAL in Netherlands
	 */
	private AlternatePayment alternatePayment;

	/**
	 * Default Constructor
	 */
	public FundingInstrument() {
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public CreditCardToken getCreditCardToken() {
		return creditCardToken;
	}

	public void setCreditCardToken(CreditCardToken creditCardToken) {
		this.creditCardToken = creditCardToken;
	}

	public PaymentCard getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}

	public ExtendedBankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(ExtendedBankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public BankToken getBankAccountToken() {
		return bankAccountToken;
	}

	public void setBankAccountToken(BankToken bankAccountToken) {
		this.bankAccountToken = bankAccountToken;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Incentive getIncentive() {
		return incentive;
	}

	public void setIncentive(Incentive incentive) {
		this.incentive = incentive;
	}

	public ExternalFunding getExternalFunding() {
		return externalFunding;
	}

	public void setExternalFunding(ExternalFunding externalFunding) {
		this.externalFunding = externalFunding;
	}

	public CarrierAccountToken getCarrierAccountToken() {
		return carrierAccountToken;
	}

	public void setCarrierAccountToken(CarrierAccountToken carrierAccountToken) {
		this.carrierAccountToken = carrierAccountToken;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public AlternatePayment getAlternatePayment() {
		return alternatePayment;
	}

	public void setAlternatePayment(AlternatePayment alternatePayment) {
		this.alternatePayment = alternatePayment;
	}
	
}
