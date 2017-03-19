package clinic.dermal.model.payment;

public class CarrierAccountToken {

	/**
	 * ID of a previously saved carrier account resource.
	 */
	private String carrierAccountId;

	/**
	 * The unique identifier of the payer used when saving this carrier account instrument.
	 */
	private String externalCustomerId;

	/**
	 * Default Constructor
	 */
	public CarrierAccountToken() {
	}

	/**
	 * Parameterized Constructor
	 */
	public CarrierAccountToken(String carrierAccountId, String externalCustomerId) {
		this.carrierAccountId = carrierAccountId;
		this.externalCustomerId = externalCustomerId;
	}

	public String getCarrierAccountId() {
		return carrierAccountId;
	}

	public void setCarrierAccountId(String carrierAccountId) {
		this.carrierAccountId = carrierAccountId;
	}

	public String getExternalCustomerId() {
		return externalCustomerId;
	}

	public void setExternalCustomerId(String externalCustomerId) {
		this.externalCustomerId = externalCustomerId;
	}
	
}
