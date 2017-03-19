package clinic.dermal.model.payment;

public class CountryCode {

	/**
	 * ISO country code based on 2-character IS0-3166-1 codes.
	 */
	private String countryCode;

	/**
	 * Default Constructor
	 */
	public CountryCode() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}
