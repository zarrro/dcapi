package clinic.dermal.model.payment;

import java.util.List;

public class Sale {

	/**
	 * Identifier of the sale transaction.
	 */
	private String id;

	/**
	 * Identifier to the purchase or transaction unit corresponding to this sale transaction.
	 */
	private String purchaseUnitReferenceId;

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Specifies payment mode of the transaction. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String paymentMode;

	/**
	 * State of the sale transaction.
	 */
	private String state;

	/**
	 * Reason code for the transaction state being Pending or Reversed. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String reasonCode;

	/**
	 * The level of seller protection in force for the transaction. Only supported when the `payment_method` is set to `paypal`. 
	 */
	private String protectionEligibility;

	/**
	 * The kind of seller protection in force for the transaction. It is returned only when protection_eligibility is ELIGIBLE or PARTIALLY_ELIGIBLE. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String protectionEligibilityType;

	/**
	 * Expected clearing time for eCheck Transactions. Returned when payment is made with eCheck. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String clearingTime;

	/**
	 * Status of the Recipient Fund. For now, it will be returned only when fund status is held
	 */
	private String paymentHoldStatus;

	/**
	 * Reasons for PayPal holding recipient fund. It is set only if payment hold status is held
	 */
	private List<String> paymentHoldReasons;

	/**
	 * Transaction fee applicable for this payment.
	 */
	private Currency transactionFee;

	/**
	 * Net amount the merchant receives for this transaction in their receivable currency. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	 */
	private Currency receivableAmount;

	/**
	 * Exchange rate applied for this transaction. Returned only in cross-currency use cases where a merchant bills a buyer in a non-primary currency for that buyer.
	 */
	private String exchangeRate;

	/**
	 * Fraud Management Filter (FMF) details applied for the payment that could result in accept, deny, or pending action. Returned in a payment response only if the merchant has enabled FMF in the profile settings and one of the fraud filters was triggered based on those settings. See [Fraud Management Filters Summary](/docs/classic/fmf/integration-guide/FMFSummary/) for more information.
	 */
	private FmfDetails fmfDetails;

	/**
	 * Receipt id is a payment identification number returned for guest users to identify the payment.
	 */
	private String receiptId;

	/**
	 * ID of the payment resource on which this transaction is based.
	 */
	private String parentPayment;

	/**
	 * Response codes returned by the processor concerning the submitted payment. Only supported when the `payment_method` is set to `credit_card`.
	 */
	private ProcessorResponse processorResponse;

	/**
	 * ID of the billing agreement used as reference to execute this transaction.
	 */
	private String billingAgreementId;

	/**
	 * Time of sale as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6)
	 */
	private String createTime;

	/**
	 * Time the resource was last updated in UTC ISO8601 format.
	 */
	private String updateTime;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public Sale() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPurchaseUnitReferenceId() {
		return purchaseUnitReferenceId;
	}

	public void setPurchaseUnitReferenceId(String purchaseUnitReferenceId) {
		this.purchaseUnitReferenceId = purchaseUnitReferenceId;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getProtectionEligibility() {
		return protectionEligibility;
	}

	public void setProtectionEligibility(String protectionEligibility) {
		this.protectionEligibility = protectionEligibility;
	}

	public String getProtectionEligibilityType() {
		return protectionEligibilityType;
	}

	public void setProtectionEligibilityType(String protectionEligibilityType) {
		this.protectionEligibilityType = protectionEligibilityType;
	}

	public String getClearingTime() {
		return clearingTime;
	}

	public void setClearingTime(String clearingTime) {
		this.clearingTime = clearingTime;
	}

	public String getPaymentHoldStatus() {
		return paymentHoldStatus;
	}

	public void setPaymentHoldStatus(String paymentHoldStatus) {
		this.paymentHoldStatus = paymentHoldStatus;
	}

	public List<String> getPaymentHoldReasons() {
		return paymentHoldReasons;
	}

	public void setPaymentHoldReasons(List<String> paymentHoldReasons) {
		this.paymentHoldReasons = paymentHoldReasons;
	}

	public Currency getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(Currency transactionFee) {
		this.transactionFee = transactionFee;
	}

	public Currency getReceivableAmount() {
		return receivableAmount;
	}

	public void setReceivableAmount(Currency receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public FmfDetails getFmfDetails() {
		return fmfDetails;
	}

	public void setFmfDetails(FmfDetails fmfDetails) {
		this.fmfDetails = fmfDetails;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getParentPayment() {
		return parentPayment;
	}

	public void setParentPayment(String parentPayment) {
		this.parentPayment = parentPayment;
	}

	public ProcessorResponse getProcessorResponse() {
		return processorResponse;
	}

	public void setProcessorResponse(ProcessorResponse processorResponse) {
		this.processorResponse = processorResponse;
	}

	public String getBillingAgreementId() {
		return billingAgreementId;
	}

	public void setBillingAgreementId(String billingAgreementId) {
		this.billingAgreementId = billingAgreementId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<Links> getLinks() {
		return links;
	}

	public void setLinks(List<Links> links) {
		this.links = links;
	}
	
}
