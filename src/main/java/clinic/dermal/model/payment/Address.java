package clinic.dermal.model.payment;

public class Address extends BaseAddress {

	/**
	 * Phone number in E.123 format. 50 characters max.
	 */
	private String phone;

	/**
	 * Type of address (e.g., HOME_OR_WORK, GIFT etc).
	 */
	private String type;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
}
