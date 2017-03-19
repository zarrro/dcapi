package clinic.dermal.model.payment;

public class BaseAddress {

	/**
	 * Line 1 of the Address (eg. number, street, etc).
	 */
	private String line1;

	/**
	 * Optional line 2 of the Address (eg. suite, apt #, etc.).
	 */
	private String line2;

	/**
	 * City name.
	 */
	private String city;

	/**
	 * 2 letter country code.
	 */
	private String countryCode;

	/**
	 * Zip code or equivalent is usually required for countries that have them. For list of countries that do not have postal codes please refer to http://en.wikipedia.org/wiki/Postal_code.
	 */
	private String postalCode;

	/**
	 * 2 letter code for US states, and the equivalent for other countries.
	 */
	private String state;

	/**
	 * BaseAddress normalization status, returned only for payers from Brazil.
	 */
	private String normalizationStatus;

	/**
	 * BaseAddress status
	 */
	private String status;

	/**
	 * Default Constructor
	 */
	public BaseAddress() {
	}

	/**
	 * Parameterized Constructor
	 */
	public BaseAddress(String line1, String countryCode) {
		this.line1 = line1;
		this.countryCode = countryCode;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNormalizationStatus() {
		return normalizationStatus;
	}

	public void setNormalizationStatus(String normalizationStatus) {
		this.normalizationStatus = normalizationStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
