package clinic.dermal.model.payment;

public class ProcessorResponse {

	/**
	 * Paypal normalized response code, generated from the processor's specific response code
	 */
	private String responseCode;

	/**
	 * Address Verification System response code. https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/
	 */
	private String avsCode;

	/**
	 * CVV System response code. https://developer.paypal.com/webapps/developer/docs/classic/api/AVSResponseCodes/
	 */
	private String cvvCode;

	/**
	 * Provides merchant advice on how to handle declines related to recurring payments
	 */
	private String adviceCode;

	/**
	 * Response back from the authorization. Provided by the processor
	 */
	private String eciSubmitted;

	/**
	 * Visa Payer Authentication Service status. Will be return from processor
	 */
	private String vpas;

	/**
	 * Default Constructor
	 */
	public ProcessorResponse() {
	}

	/**
	 * Parameterized Constructor
	 */
	public ProcessorResponse(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getAvsCode() {
		return avsCode;
	}

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getAdviceCode() {
		return adviceCode;
	}

	public void setAdviceCode(String adviceCode) {
		this.adviceCode = adviceCode;
	}

	public String getEciSubmitted() {
		return eciSubmitted;
	}

	public void setEciSubmitted(String eciSubmitted) {
		this.eciSubmitted = eciSubmitted;
	}

	public String getVpas() {
		return vpas;
	}

	public void setVpas(String vpas) {
		this.vpas = vpas;
	}
	
}
