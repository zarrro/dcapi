package clinic.dermal.model.payment;

public class Measurement {
	/**
	 * Value this measurement represents.
	 */
	private String value;
	/**
	 * Unit in which the value is represented.
	 */
	private String unit;

	/**
	 * Value this measurement represents.
	 */
	@java.lang.SuppressWarnings("all")
	public String getValue() {
		return this.value;
	}

	/**
	 * Unit in which the value is represented.
	 */
	@java.lang.SuppressWarnings("all")
	public String getUnit() {
		return this.unit;
	}

	/**
	 * Value this measurement represents.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Measurement setValue(final String value) {
		this.value = value;
		return this;
	}

	/**
	 * Unit in which the value is represented.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Measurement setUnit(final String unit) {
		this.unit = unit;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Measurement)) return false;
		final Measurement other = (Measurement) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$value = this.getValue();
		final java.lang.Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
		final java.lang.Object this$unit = this.getUnit();
		final java.lang.Object other$unit = other.getUnit();
		if (this$unit == null ? other$unit != null : !this$unit.equals(other$unit)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Measurement;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		final java.lang.Object $unit = this.getUnit();
		result = result * PRIME + ($unit == null ? 43 : $unit.hashCode());
		return result;
	}
}