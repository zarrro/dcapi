package clinic.dermal.model.payment;

public class CreditCardToken {

	/**
	 * ID of credit card previously stored using `/vault/credit-card`.
	 */
	private String creditCardId;

	/**
	 * A unique identifier that you can assign and track when storing a credit card or using a stored credit card. This ID can help to avoid unintentional use or misuse of credit cards. This ID can be any value you would like to associate with the saved card, such as a UUID, username, or email address.  **Required when using a stored credit card if a payer_id was originally provided when storing the credit card in vault.**
	 */
	private String payerId;

	/**
	 * Last four digits of the stored credit card number.
	 */
	private String last4;

	/**
	 * Credit card type. Valid types are: `visa`, `mastercard`, `discover`, `amex`. Values are presented in lowercase and not should not be used for display.
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
	 * Default Constructor
	 */
	public CreditCardToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CreditCardToken(String creditCardId) {
		this.creditCardId = creditCardId;
	}

	public String getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(String creditCardId) {
		this.creditCardId = creditCardId;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
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
	
}
