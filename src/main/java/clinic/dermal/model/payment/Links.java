package clinic.dermal.model.payment;

public class Links {
	/**
	 */
	private String href;
	/**
	 */
	private String rel;
	/**
	 */
	private HyperSchema targetSchema;
	/**
	 */
	private String method;
	/**
	 */
	private String enctype;
	/**
	 */
	private HyperSchema schema;

	/**
	 * Default Constructor
	 */
	public Links() {
	}

	/**
	 * Parameterized Constructor
	 */
	public Links(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getHref() {
		return this.href;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getRel() {
		return this.rel;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema getTargetSchema() {
		return this.targetSchema;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getMethod() {
		return this.method;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getEnctype() {
		return this.enctype;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema getSchema() {
		return this.schema;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setHref(final String href) {
		this.href = href;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setRel(final String rel) {
		this.rel = rel;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setTargetSchema(final HyperSchema targetSchema) {
		this.targetSchema = targetSchema;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setMethod(final String method) {
		this.method = method;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setEnctype(final String enctype) {
		this.enctype = enctype;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Links setSchema(final HyperSchema schema) {
		this.schema = schema;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Links)) return false;
		final Links other = (Links) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$href = this.getHref();
		final java.lang.Object other$href = other.getHref();
		if (this$href == null ? other$href != null : !this$href.equals(other$href)) return false;
		final java.lang.Object this$rel = this.getRel();
		final java.lang.Object other$rel = other.getRel();
		if (this$rel == null ? other$rel != null : !this$rel.equals(other$rel)) return false;
		final java.lang.Object this$targetSchema = this.getTargetSchema();
		final java.lang.Object other$targetSchema = other.getTargetSchema();
		if (this$targetSchema == null ? other$targetSchema != null : !this$targetSchema.equals(other$targetSchema)) return false;
		final java.lang.Object this$method = this.getMethod();
		final java.lang.Object other$method = other.getMethod();
		if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
		final java.lang.Object this$enctype = this.getEnctype();
		final java.lang.Object other$enctype = other.getEnctype();
		if (this$enctype == null ? other$enctype != null : !this$enctype.equals(other$enctype)) return false;
		final java.lang.Object this$schema = this.getSchema();
		final java.lang.Object other$schema = other.getSchema();
		if (this$schema == null ? other$schema != null : !this$schema.equals(other$schema)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Links;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $href = this.getHref();
		result = result * PRIME + ($href == null ? 43 : $href.hashCode());
		final java.lang.Object $rel = this.getRel();
		result = result * PRIME + ($rel == null ? 43 : $rel.hashCode());
		final java.lang.Object $targetSchema = this.getTargetSchema();
		result = result * PRIME + ($targetSchema == null ? 43 : $targetSchema.hashCode());
		final java.lang.Object $method = this.getMethod();
		result = result * PRIME + ($method == null ? 43 : $method.hashCode());
		final java.lang.Object $enctype = this.getEnctype();
		result = result * PRIME + ($enctype == null ? 43 : $enctype.hashCode());
		final java.lang.Object $schema = this.getSchema();
		result = result * PRIME + ($schema == null ? 43 : $schema.hashCode());
		return result;
	}
}