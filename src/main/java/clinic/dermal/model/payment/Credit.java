package clinic.dermal.model.payment;

public class Credit {

	/**
	 * Unique identifier of credit resource.
	 */
	private String id;

	/**
	 * specifies type of credit
	 */
	private String type;

	/**
	 * Default Constructor
	 */
	public Credit() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Credit(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
