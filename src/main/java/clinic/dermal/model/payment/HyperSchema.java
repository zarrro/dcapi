package clinic.dermal.model.payment;

import java.util.List;

public class HyperSchema {
	/**
	 */
	private List<Links> links;
	/**
	 */
	private String fragmentResolution;
	/**
	 */
	private Boolean readonly;
	/**
	 */
	private String contentEncoding;
	/**
	 */
	private String pathStart;
	/**
	 */
	private String mediaType;

	/**
	 * Default Constructor
	 */
	public HyperSchema() {
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public List<Links> getLinks() {
		return this.links;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getFragmentResolution() {
		return this.fragmentResolution;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public Boolean getReadonly() {
		return this.readonly;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getContentEncoding() {
		return this.contentEncoding;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getPathStart() {
		return this.pathStart;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public String getMediaType() {
		return this.mediaType;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setLinks(final List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setFragmentResolution(final String fragmentResolution) {
		this.fragmentResolution = fragmentResolution;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setReadonly(final Boolean readonly) {
		this.readonly = readonly;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setContentEncoding(final String contentEncoding) {
		this.contentEncoding = contentEncoding;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setPathStart(final String pathStart) {
		this.pathStart = pathStart;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public HyperSchema setMediaType(final String mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof HyperSchema)) return false;
		final HyperSchema other = (HyperSchema) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$links = this.getLinks();
		final java.lang.Object other$links = other.getLinks();
		if (this$links == null ? other$links != null : !this$links.equals(other$links)) return false;
		final java.lang.Object this$fragmentResolution = this.getFragmentResolution();
		final java.lang.Object other$fragmentResolution = other.getFragmentResolution();
		if (this$fragmentResolution == null ? other$fragmentResolution != null : !this$fragmentResolution.equals(other$fragmentResolution)) return false;
		final java.lang.Object this$readonly = this.getReadonly();
		final java.lang.Object other$readonly = other.getReadonly();
		if (this$readonly == null ? other$readonly != null : !this$readonly.equals(other$readonly)) return false;
		final java.lang.Object this$contentEncoding = this.getContentEncoding();
		final java.lang.Object other$contentEncoding = other.getContentEncoding();
		if (this$contentEncoding == null ? other$contentEncoding != null : !this$contentEncoding.equals(other$contentEncoding)) return false;
		final java.lang.Object this$pathStart = this.getPathStart();
		final java.lang.Object other$pathStart = other.getPathStart();
		if (this$pathStart == null ? other$pathStart != null : !this$pathStart.equals(other$pathStart)) return false;
		final java.lang.Object this$mediaType = this.getMediaType();
		final java.lang.Object other$mediaType = other.getMediaType();
		if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof HyperSchema;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $links = this.getLinks();
		result = result * PRIME + ($links == null ? 43 : $links.hashCode());
		final java.lang.Object $fragmentResolution = this.getFragmentResolution();
		result = result * PRIME + ($fragmentResolution == null ? 43 : $fragmentResolution.hashCode());
		final java.lang.Object $readonly = this.getReadonly();
		result = result * PRIME + ($readonly == null ? 43 : $readonly.hashCode());
		final java.lang.Object $contentEncoding = this.getContentEncoding();
		result = result * PRIME + ($contentEncoding == null ? 43 : $contentEncoding.hashCode());
		final java.lang.Object $pathStart = this.getPathStart();
		result = result * PRIME + ($pathStart == null ? 43 : $pathStart.hashCode());
		final java.lang.Object $mediaType = this.getMediaType();
		result = result * PRIME + ($mediaType == null ? 43 : $mediaType.hashCode());
		return result;
	}
}