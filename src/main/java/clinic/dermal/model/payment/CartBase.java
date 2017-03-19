package clinic.dermal.model.payment;

import java.util.List;

public class CartBase {

	/**
	 * Merchant identifier to the purchase unit. Optional parameter
	 */
	private String referenceId;

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Recipient of the funds in this transaction.
	 */
	private Payee payee;

	/**
	 * Description of what is being paid for.
	 */
	private String description;

	/**
	 * Note to the recipient of the funds in this transaction.
	 */
	private String noteToPayee;

	/**
	 * free-form field for the use of clients
	 */
	private String custom;

	/**
	 * invoice number to track this payment
	 */
	private String invoiceNumber;

	/**
	 * Soft descriptor used when charging this funding source. If length exceeds max length, the value will be truncated
	 */
	private String softDescriptor;

	/**
	 * Soft descriptor city used when charging this funding source. If length exceeds max length, the value will be truncated. Only supported when the `payment_method` is set to `credit_card`
	 */
	private String softDescriptorCity;

	/**
	 * Payment options requested for this purchase unit
	 */
	private PaymentOptions paymentOptions;

	/**
	 * List of items being paid for.
	 */
	private ItemList itemList;

	/**
	 * URL to send payment notifications
	 */
	private String notifyUrl;

	/**
	 * Url on merchant site pertaining to this payment.
	 */
	private String orderUrl;

	/**
	 * List of external funding being applied to the purchase unit. Each external_funding unit should have a unique reference_id
	 */
	private List<ExternalFunding> externalFunding;

	/**
	 * Default Constructor
	 */
	public CartBase() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CartBase(Amount amount) {
		this.amount = amount;
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

	public Payee getPayee() {
		return payee;
	}

	public void setPayee(Payee payee) {
		this.payee = payee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNoteToPayee() {
		return noteToPayee;
	}

	public void setNoteToPayee(String noteToPayee) {
		this.noteToPayee = noteToPayee;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getSoftDescriptor() {
		return softDescriptor;
	}

	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}

	public String getSoftDescriptorCity() {
		return softDescriptorCity;
	}

	public void setSoftDescriptorCity(String softDescriptorCity) {
		this.softDescriptorCity = softDescriptorCity;
	}

	public PaymentOptions getPaymentOptions() {
		return paymentOptions;
	}

	public void setPaymentOptions(PaymentOptions paymentOptions) {
		this.paymentOptions = paymentOptions;
	}

	public ItemList getItemList() {
		return itemList;
	}

	public void setItemList(ItemList itemList) {
		this.itemList = itemList;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getOrderUrl() {
		return orderUrl;
	}

	public void setOrderUrl(String orderUrl) {
		this.orderUrl = orderUrl;
	}

	public List<ExternalFunding> getExternalFunding() {
		return externalFunding;
	}

	public void setExternalFunding(List<ExternalFunding> externalFunding) {
		this.externalFunding = externalFunding;
	}
}
