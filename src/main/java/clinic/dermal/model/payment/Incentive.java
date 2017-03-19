package clinic.dermal.model.payment;

public class Incentive {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String id;

	/**
	 * Code that identifies the incentive.
	 */
	private String code;

	/**
	 * Name of the incentive.
	 */
	private String name;

	/**
	 * Description of the incentive.
	 */
	private String description;

	/**
	 * Indicates incentive is applicable for this minimum purchase amount.
	 */
	private Currency minimumPurchaseAmount;

	/**
	 * Logo image url for the incentive.
	 */
	private String logoImageUrl;

	/**
	 * expiry date of the incentive.
	 */
	private String expiryDate;

	/**
	 * Specifies type of incentive
	 */
	private String type;

	/**
	 * URI to the associated terms
	 */
	private String terms;

	/**
	 * Default Constructor
	 */
	public Incentive() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Currency getMinimumPurchaseAmount() {
		return minimumPurchaseAmount;
	}

	public void setMinimumPurchaseAmount(Currency minimumPurchaseAmount) {
		this.minimumPurchaseAmount = minimumPurchaseAmount;
	}

	public String getLogoImageUrl() {
		return logoImageUrl;
	}

	public void setLogoImageUrl(String logoImageUrl) {
		this.logoImageUrl = logoImageUrl;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}
}
