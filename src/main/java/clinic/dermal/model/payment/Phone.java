package clinic.dermal.model.payment;

public class Phone {
	/**
	 * Country code (from in E.164 format)
	 */
	private String countryCode;
	/**
	 * In-country phone number (from in E.164 format)
	 */
	private String nationalNumber;
	/**
	 * Phone extension
	 */
	private String extension;

	/**
	 * Default Constructor
	 */
	public Phone() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Phone(String countryCode, String nationalNumber) {
		this.countryCode = countryCode;
		this.nationalNumber = nationalNumber;
	}

	/**
	 * Country code (from in E.164 format)
	 */
	@java.lang.SuppressWarnings("all")
	public String getCountryCode() {
		return this.countryCode;
	}

	/**
	 * In-country phone number (from in E.164 format)
	 */
	@java.lang.SuppressWarnings("all")
	public String getNationalNumber() {
		return this.nationalNumber;
	}

	/**
	 * Phone extension
	 */
	@java.lang.SuppressWarnings("all")
	public String getExtension() {
		return this.extension;
	}

	/**
	 * Country code (from in E.164 format)
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Phone setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * In-country phone number (from in E.164 format)
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Phone setNationalNumber(final String nationalNumber) {
		this.nationalNumber = nationalNumber;
		return this;
	}

	/**
	 * Phone extension
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Phone setExtension(final String extension) {
		this.extension = extension;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Phone)) return false;
		final Phone other = (Phone) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$countryCode = this.getCountryCode();
		final java.lang.Object other$countryCode = other.getCountryCode();
		if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode)) return false;
		final java.lang.Object this$nationalNumber = this.getNationalNumber();
		final java.lang.Object other$nationalNumber = other.getNationalNumber();
		if (this$nationalNumber == null ? other$nationalNumber != null : !this$nationalNumber.equals(other$nationalNumber)) return false;
		final java.lang.Object this$extension = this.getExtension();
		final java.lang.Object other$extension = other.getExtension();
		if (this$extension == null ? other$extension != null : !this$extension.equals(other$extension)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Phone;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $countryCode = this.getCountryCode();
		result = result * PRIME + ($countryCode == null ? 43 : $countryCode.hashCode());
		final java.lang.Object $nationalNumber = this.getNationalNumber();
		result = result * PRIME + ($nationalNumber == null ? 43 : $nationalNumber.hashCode());
		final java.lang.Object $extension = this.getExtension();
		result = result * PRIME + ($extension == null ? 43 : $extension.hashCode());
		return result;
	}
}