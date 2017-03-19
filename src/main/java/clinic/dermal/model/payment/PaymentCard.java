package clinic.dermal.model.payment;

import java.util.List;

public class PaymentCard {

	/**
	 * The ID of a credit card to save for later use.
	 */
	private String id;

	/**
	 * The card number.
	 */
	private String number;

	/**
	 * The card type.
	 */
	private String type;

	/**
	 * The two-digit expiry month for the card.
	 */
	private String expireMonth;

	/**
	 * The four-digit expiry year for the card.
	 */
	private String expireYear;

	/**
	 * The two-digit start month for the card. Required for UK Maestro cards.
	 */
	private String startMonth;

	/**
	 * The four-digit start year for the card. Required for UK Maestro cards. 
	 */
	private String startYear;

	/**
	 * The validation code for the card. Supported for payments but not for saving payment cards for future use.
	 */
	private String cvv2;

	/**
	 * The first name of the card holder.
	 */
	private String firstName;

	/**
	 * The last name of the card holder.
	 */
	private String lastName;

	/**
	 * The two-letter country code.
	 */
	private CountryCode billingCountry;

	/**
	 * The billing address for the card.
	 */
	private Address billingAddress;

	/**
	 * The ID of the customer who owns this card account. The facilitator generates and provides this ID. Required when you create or use a stored funding instrument in the PayPal vault.
	 */
	private String externalCustomerId;

	/**
	 * The state of the funding instrument.
	 */
	private String status;

	/**
	 * The product class of the financial instrument issuer.
	 */
	private String cardProductClass;

	/**
	 * The date and time until when this instrument can be used fund a payment.
	 */
	private String validUntil;

	/**
	 * The one- to two-digit card issue number. Required for UK Maestro cards.
	 */
	private String issueNumber;

	/**
	 * Fields required to support 3d secure information when processing credit card payments. Only supported when the `payment_method` is set to `credit_card`.
	 */
	private Card3dSecureInfo card3dSecureInfo;

	/**
	 * 
	 */
	private List<DefinitionsLinkdescription> links;

	/**
	 * Default Constructor
	 */
	public PaymentCard() {
	}

	/**
	 * @deprecated Please use {@link #setCard3dSecureInfo(Card3dSecureInfo)} instead.
	 *
	 * Setter for 3dSecureInfo
	 */
	@Deprecated
	public PaymentCard set3dSecureInfo(Card3dSecureInfo card3dSecureInfo) {
		this.card3dSecureInfo = card3dSecureInfo;
		return this;
	}

	/**
	 * @deprecated Please use {@link #getCard3dSecureInfo()} instead.
	 *
	 * Getter for 3dSecureInfo
	 */
	public Card3dSecureInfo get3dSecureInfo() {
		return this.card3dSecureInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public CountryCode getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(CountryCode billingCountry) {
		this.billingCountry = billingCountry;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getExternalCustomerId() {
		return externalCustomerId;
	}

	public void setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCardProductClass() {
		return cardProductClass;
	}

	public void setCardProductClass(String cardProductClass) {
		this.cardProductClass = cardProductClass;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	public Card3dSecureInfo getCard3dSecureInfo() {
		return card3dSecureInfo;
	}

	public void setCard3dSecureInfo(Card3dSecureInfo card3dSecureInfo) {
		this.card3dSecureInfo = card3dSecureInfo;
	}

	public List<DefinitionsLinkdescription> getLinks() {
		return links;
	}

	public void setLinks(List<DefinitionsLinkdescription> links) {
		this.links = links;
	}
}
