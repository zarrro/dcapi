package clinic.dermal.model.payment;

import java.util.List;

public class ItemList {

	/**
	 * List of items.
	 */
	private List<Item> items;

	/**
	 * Shipping address.
	 */
	private ShippingAddress shippingAddress;

	/**
	 * Shipping method used for this payment like USPSParcel etc.
	 */
	private String shippingMethod;

	/**
	 * Allows merchant's to share payer’s contact number with PayPal for the current payment. Final contact number of payer associated with the transaction might be same as shipping_phone_number or different based on Payer’s action on PayPal. The phone number must be represented in its canonical international format, as defined by the E.164 numbering plan
	 */
	private String shippingPhoneNumber;

	/**
	 * Default Constructor
	 */
	public ItemList() {
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getShippingPhoneNumber() {
		return shippingPhoneNumber;
	}

	public void setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
	}
}
