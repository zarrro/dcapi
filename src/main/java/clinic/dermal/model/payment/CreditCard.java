package clinic.dermal.model.payment;

import java.util.List;

public class CreditCard {

	/**
	 * ID of the credit card. This ID is provided in the response when storing credit cards. **Required if using a stored credit card.**
	 */
	private String id;

	/**
	 * Credit card number. Numeric characters only with no spaces or punctuation. The string must conform with modulo and length required by each credit card type. *Redacted in responses.*
	 */
	private String number;

	/**
	 * Credit card type. Valid types are: `visa`, `mastercard`, `discover`, `amex`
	 */
	private String type;

	/**
	 * Expiration month with no leading zero. Acceptable values are 1 through 12.
	 */
	private int expireMonth;

	/**
	 * 4-digit expiration year.
	 */
	private int expireYear;

	/**
	 * 3-4 digit card validation code.
	 */
	private String cvv2;

	/**
	 * Cardholder's first name.
	 */
	private String firstName;

	/**
	 * Cardholder's last name.
	 */
	private String lastName;

	/**
	 * Billing Address associated with this card.
	 */
	private Address billingAddress;

	/**
	 * A unique identifier of the customer to whom this bank account belongs. Generated and provided by the facilitator. **This is now used in favor of `payer_id` when creating or using a stored funding instrument in the vault.**
	 */
	private String externalCustomerId;

	/**
	 * State of the credit card funding instrument.
	 */
	private String state;

	/**
	 * Funding instrument expiration date.
	 */
	private String validUntil;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Payer ID
	 */
	private String payerId;


	/**
	 * Default Constructor
	 */
	public CreditCard() {
	}

	/**
	 * @deprecated Please use {@link #getCvv2String()} instead.
	 * Getter for cvv2
	 * Returns -1 if <code>cvv2</code> is null.
	 * Not autogenerating using lombok as it includes logic to return -1 on null.
	 */
	public int getCvv2() {
		if (this.cvv2 == null) {
			return -1;
		} else {
			return Integer.valueOf(this.cvv2);
		}
	}

	/**
	 * @deprecated The cvv2 needs to be a string, as any cvv2 starting with 0 is sent invalid to servers. Please use {@link #setCvv2(String)} instead.
	 * @param cvv2 Integer cvv2
	 * @return CreditCard
	 */
	public CreditCard setCvv2(Integer cvv2) {
		this.cvv2 = cvv2.toString();
		return this;
	}

	/**
	 * @param cvv2 String cvv2
	 * @return CreditCard
	 */
	public CreditCard setCvv2(String cvv2) {
		this.cvv2 = cvv2;
		return this;
	}

	/**
	 * Returns the cvv2
	 * @return String representation of cvv2
	 */
	public String getCvv2String() {
		return this.cvv2;
	}

	/**
	 * Parameterized Constructor
	 */
	public CreditCard(String number, String type, int expireMonth, int expireYear) {
		this.number = number;
		this.type = type;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
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

	public int getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(int expireMonth) {
		this.expireMonth = expireMonth;
	}

	public int getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(int expireYear) {
		this.expireYear = expireYear;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public List<Links> getLinks() {
		return links;
	}

	public void setLinks(List<Links> links) {
		this.links = links;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
}
