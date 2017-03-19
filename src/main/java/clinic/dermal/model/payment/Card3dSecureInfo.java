package clinic.dermal.model.payment;

public class Card3dSecureInfo {

	/**
	 * Authorization status from 3ds provider. Should be echoed back in the response
	 */
	private String authStatus;

	/**
	 * Numeric flag to indicate how the payment should be processed in relationship to 3d-secure. If 0 then ignore all 3d values and process as non-3ds 
	 */
	private String eci;

	/**
	 * Cardholder Authentication Verification Value (used by VISA). 
	 */
	private String cavv;

	/**
	 * Transaction identifier from authenticator.
	 */
	private String xid;

	/**
	 * Name of the actual 3ds vendor who processed the 3ds request, e.g. Cardinal
	 */
	private String mpiVendor;

	/**
	 * Default Constructor
	 */
	public Card3dSecureInfo() {
	}

	public String getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getEci() {
		return eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String cavv) {
		this.cavv = cavv;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}

	public String getMpiVendor() {
		return mpiVendor;
	}

	public void setMpiVendor(String mpiVendor) {
		this.mpiVendor = mpiVendor;
	}
}
