package clinic.dermal.model.payment;

public class ShippingAddress extends Address {

	/**
	 * Address ID assigned in PayPal system.
	 */
	private String id;

	/**
	 * Name of the recipient at this address.
	 */
	private String recipientName;

	/**
	 * Default shipping address of the Payer.
	 */
	private Boolean defaultAddress;

	/**
	 * Default Constructor
	 */
	public ShippingAddress() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ShippingAddress(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public Boolean getDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(Boolean defaultAddress) {
		this.defaultAddress = defaultAddress;
	}
	
}
