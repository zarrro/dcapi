package clinic.dermal.model.payment;

public class DefinitionsLinkdescription {

	/**
	 * a URI template, as defined by RFC 6570, with the addition of the $, ( and ) characters for pre-processing
	 */
	private String href;

	/**
	 * relation to the target resource of the link
	 */
	private String rel;

	/**
	 * a title for the link
	 */
	private String title;

	/**
	 * JSON Schema describing the link target
	 */
	private DefinitionsLinkdescription targetSchema;

	/**
	 * media type (as defined by RFC 2046) describing the link target
	 */
	private String mediaType;

	/**
	 * method for requesting the target of the link (e.g. for HTTP this might be "GET" or "DELETE")
	 */
	private String method;

	/**
	 * The media type in which to submit data along with the request
	 */
	private String encType;

	/**
	 * Schema describing the data to submit along with the request
	 */
	private DefinitionsLinkdescription schema;

	/**
	 * Default Constructor
	 */
	public DefinitionsLinkdescription() {
	}

	/**
	 * Parameterized Constructor
	 */
	public DefinitionsLinkdescription(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DefinitionsLinkdescription getTargetSchema() {
		return targetSchema;
	}

	public void setTargetSchema(DefinitionsLinkdescription targetSchema) {
		this.targetSchema = targetSchema;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getEncType() {
		return encType;
	}

	public void setEncType(String encType) {
		this.encType = encType;
	}

	public DefinitionsLinkdescription getSchema() {
		return schema;
	}

	public void setSchema(DefinitionsLinkdescription schema) {
		this.schema = schema;
	}
	
}
