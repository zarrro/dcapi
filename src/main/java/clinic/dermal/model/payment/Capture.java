package clinic.dermal.model.payment;

import java.util.List;

public class Capture {

	/**
	 * The ID of the capture transaction.
	 */
	private String id;

	/**
	 * The amount to capture. If the amount matches the orginally authorized amount, the state of the authorization changes to `captured`. If not, the state of the authorization changes to `partially_captured`.
	 */
	private Amount amount;

	/**
	 * Indicates whether to release all remaining funds that the authorization holds in the funding instrument. Default is `false`.
	 */
	private Boolean isFinalCapture;

	/**
	 * The state of the capture.
	 */
	private String state;

	/**
	 * The reason code that describes why the transaction state is pending or reversed.
	 */
	private String reasonCode;

	/**
	 * The ID of the payment on which this transaction is based.
	 */
	private String parentPayment;

	/**
	 * The invoice number to track this payment.
	 */
	private String invoiceNumber;

	/**
	 * The transaction fee for this payment.
	 */
	private Currency transactionFee;

	/**
	 * The date and time of capture, as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String createTime;

	/**
	 * The date and time when the resource was last updated.
	 */
	private String updateTime;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public Capture() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Boolean getIsFinalCapture() {
		return isFinalCapture;
	}

	public void setIsFinalCapture(Boolean isFinalCapture) {
		this.isFinalCapture = isFinalCapture;
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

	public String getParentPayment() {
		return parentPayment;
	}

	public void setParentPayment(String parentPayment) {
		this.parentPayment = parentPayment;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Currency getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(Currency transactionFee) {
		this.transactionFee = transactionFee;
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
