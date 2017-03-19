package clinic.dermal.model.payment;

public class NameValuePair {
	/**
	 * Key for the name value pair.  The value name types should be correlated
	 */
	private String name;
	/**
	 * Value for the name value pair.
	 */
	private String value;

	/**
	 * Default Constructor
	 */
	public NameValuePair() {
	}

	/**
	 * Parameterized Constructor
	 */
	public NameValuePair(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Key for the name value pair.  The value name types should be correlated
	 */
	@java.lang.SuppressWarnings("all")
	public String getName() {
		return this.name;
	}

	/**
	 * Value for the name value pair.
	 */
	@java.lang.SuppressWarnings("all")
	public String getValue() {
		return this.value;
	}

	/**
	 * Key for the name value pair.  The value name types should be correlated
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public NameValuePair setName(final String name) {
		this.name = name;
		return this;
	}

	/**
	 * Value for the name value pair.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public NameValuePair setValue(final String value) {
		this.value = value;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof NameValuePair)) return false;
		final NameValuePair other = (NameValuePair) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$name = this.getName();
		final java.lang.Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final java.lang.Object this$value = this.getValue();
		final java.lang.Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof NameValuePair;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final java.lang.Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		return result;
	}
}