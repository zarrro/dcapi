package clinic.dermal.model.payment;

public class FmfDetails {

	/**
	 * Type of filter.
	 */
	private String filterType;

	/**
	 * Filter Identifier.
	 */
	private String filterId;

	/**
	 * Name of the filter
	 */
	private String name;

	/**
	 * Description of the filter.
	 */
	private String description;

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getFilterId() {
		return filterId;
	}

	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
