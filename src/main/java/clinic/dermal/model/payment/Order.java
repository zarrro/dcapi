package clinic.dermal.model.payment;

import java.util.List;

public class Order {

	/**
	 * Identifier of the order transaction.
	 */
	private String id;

	/**
	 * Identifier to the purchase unit associated with this object. Obsolete. Use one in cart_base.
	 */
	private String purchaseUnitReferenceId;

	/**
	 * @deprecated Use {@link #purchaseUnitReferenceId} instead
	 * Identifier to the purchase unit associated with this object. Obsolete. Use one in cart_base.
	 */
	@Deprecated
	private String referenceId;

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * specifies payment mode of the transaction
	 */
	private String paymentMode;

	/**
	 * State of the order transaction.
	 */
	private String state;

	/**
	 * Reason code for the transaction state being Pending or Reversed. This field will replace pending_reason field eventually. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String reasonCode;

	/**
	 * @deprecated Reason code for the transaction state being Pending. Obsolete. Retained for backward compatability. Use reason_code field above instead.
	 */
	@Deprecated
	private String pendingReason;

	/**
	 * The level of seller protection in force for the transaction.
	 */
	private String protectionEligibility;

	/**
	 * The kind of seller protection in force for the transaction. This property is returned only when the `protection_eligibility` property is set to `ELIGIBLE`or `PARTIALLY_ELIGIBLE`. Only supported when the `payment_method` is set to `paypal`. Allowed values:<br> `ITEM_NOT_RECEIVED_ELIGIBLE`- Sellers are protected against claims for items not received.<br> `UNAUTHORIZED_PAYMENT_ELIGIBLE`- Sellers are protected against claims for unauthorized payments.<br> One or both of the allowed values can be returned.
	 */
	private String protectionEligibilityType;

	/**
	 * ID of the Payment resource that this transaction is based on.
	 */
	private String parentPayment;

	/**
	 * Fraud Management Filter (FMF) details applied for the payment that could result in accept/deny/pending action.
	 */
	private FmfDetails fmfDetails;

	/**
	 * Time the resource was created in UTC ISO8601 format.
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
	public Order() {
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

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
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

	public String getPendingReason() {
		return pendingReason;
	}

	public void setPendingReason(String pendingReason) {
		this.pendingReason = pendingReason;
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

	public String getParentPayment() {
		return parentPayment;
	}

	public void setParentPayment(String parentPayment) {
		this.parentPayment = parentPayment;
	}

	public FmfDetails getFmfDetails() {
		return fmfDetails;
	}

	public void setFmfDetails(FmfDetails fmfDetails) {
		this.fmfDetails = fmfDetails;
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
