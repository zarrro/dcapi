package clinic.dermal.model.payment;

import java.util.List;

public class Payment {
	/**
	 * Identifier of the payment resource created.
	 */
	private String id;
	/**
	 * Payment intent.
	 */
	private String intent;
	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	private Payer payer;
	/**
	 * Receiver of funds for this payment. **Readonly for PayPal external REST payments.**
	 */
	private Payee payee;
	/**
	 * ID of the cart to execute the payment.
	 */
	private String cart;
	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transaction> transactions;
	/**
	 * Applicable for advanced payments like multi seller payment (MSP) to support partial failures
	 */
	private List<Error> failedTransactions;
	/**
	 * The state of the payment, authorization, or order transaction. The value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	 */
	private String state;
	/**
	 * PayPal generated identifier for the merchant's payment experience profile. Refer to [this](https://developer.paypal.com/docs/api/#payment-experience) link to create experience profile ID.
	 */
	private String experienceProfileId;
	/**
	 * free-form field for the use of clients to pass in a message to the payer
	 */
	private String noteToPayer;
	/**
	 * Set of redirect URLs you provide only for PayPal-based payments.
	 */
	private RedirectUrls redirectUrls;
	/**
	 * Failure reason code returned when the payment failed for some valid reasons.
	 */
	private String failureReason;
	/**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String createTime;
	/**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String updateTime;
	/**
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public Payment() {
	}
	
	/**
	 * Identifier of the payment resource created.
	 */
	@java.lang.SuppressWarnings("all")
	public String getId() {
		return this.id;
	}

	/**
	 * Payment intent.
	 */
	@java.lang.SuppressWarnings("all")
	public String getIntent() {
		return this.intent;
	}

	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	@java.lang.SuppressWarnings("all")
	public Payer getPayer() {
		return this.payer;
	}

	/**
	 * Receiver of funds for this payment. **Readonly for PayPal external REST payments.**
	 */
	@java.lang.SuppressWarnings("all")
	public Payee getPayee() {
		return this.payee;
	}

	/**
	 * ID of the cart to execute the payment.
	 */
	@java.lang.SuppressWarnings("all")
	public String getCart() {
		return this.cart;
	}

	/**
	 * Transactional details including the amount and item details.
	 */
	@java.lang.SuppressWarnings("all")
	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	/**
	 * Applicable for advanced payments like multi seller payment (MSP) to support partial failures
	 */
	@java.lang.SuppressWarnings("all")
	public List<Error> getFailedTransactions() {
		return this.failedTransactions;
	}

	/**
	 * The state of the payment, authorization, or order transaction. The value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	 */
	@java.lang.SuppressWarnings("all")
	public String getState() {
		return this.state;
	}

	/**
	 * PayPal generated identifier for the merchant's payment experience profile. Refer to [this](https://developer.paypal.com/docs/api/#payment-experience) link to create experience profile ID.
	 */
	@java.lang.SuppressWarnings("all")
	public String getExperienceProfileId() {
		return this.experienceProfileId;
	}

	/**
	 * free-form field for the use of clients to pass in a message to the payer
	 */
	@java.lang.SuppressWarnings("all")
	public String getNoteToPayer() {
		return this.noteToPayer;
	}

	/**
	 * Set of redirect URLs you provide only for PayPal-based payments.
	 */
	@java.lang.SuppressWarnings("all")
	public RedirectUrls getRedirectUrls() {
		return this.redirectUrls;
	}

	/**
	 * Failure reason code returned when the payment failed for some valid reasons.
	 */
	@java.lang.SuppressWarnings("all")
	public String getFailureReason() {
		return this.failureReason;
	}

	/**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	@java.lang.SuppressWarnings("all")
	public String getCreateTime() {
		return this.createTime;
	}

	/**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	@java.lang.SuppressWarnings("all")
	public String getUpdateTime() {
		return this.updateTime;
	}

	/**
	 */
	@java.lang.SuppressWarnings("all")
	public List<Links> getLinks() {
		return this.links;
	}

	/**
	 * Identifier of the payment resource created.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setId(final String id) {
		this.id = id;
		return this;
	}

	/**
	 * Payment intent.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setIntent(final String intent) {
		this.intent = intent;
		return this;
	}

	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setPayer(final Payer payer) {
		this.payer = payer;
		return this;
	}

	/**
	 * Receiver of funds for this payment. **Readonly for PayPal external REST payments.**
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setPayee(final Payee payee) {
		this.payee = payee;
		return this;
	}

	/**
	 * ID of the cart to execute the payment.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setCart(final String cart) {
		this.cart = cart;
		return this;
	}

	/**
	 * Transactional details including the amount and item details.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setTransactions(final List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

	/**
	 * Applicable for advanced payments like multi seller payment (MSP) to support partial failures
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setFailedTransactions(final List<Error> failedTransactions) {
		this.failedTransactions = failedTransactions;
		return this;
	}

	/**
	 * The state of the payment, authorization, or order transaction. The value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setState(final String state) {
		this.state = state;
		return this;
	}

	/**
	 * PayPal generated identifier for the merchant's payment experience profile. Refer to [this](https://developer.paypal.com/docs/api/#payment-experience) link to create experience profile ID.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setExperienceProfileId(final String experienceProfileId) {
		this.experienceProfileId = experienceProfileId;
		return this;
	}

	/**
	 * free-form field for the use of clients to pass in a message to the payer
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setNoteToPayer(final String noteToPayer) {
		this.noteToPayer = noteToPayer;
		return this;
	}

	/**
	 * Set of redirect URLs you provide only for PayPal-based payments.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setRedirectUrls(final RedirectUrls redirectUrls) {
		this.redirectUrls = redirectUrls;
		return this;
	}

	/**
	 * Failure reason code returned when the payment failed for some valid reasons.
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setFailureReason(final String failureReason) {
		this.failureReason = failureReason;
		return this;
	}

	/**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setCreateTime(final String createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setUpdateTime(final String updateTime) {
		this.updateTime = updateTime;
		return this;
	}

	/**
	 *
	 * @return this
	 */
	@java.lang.SuppressWarnings("all")
	public Payment setLinks(final List<Links> links) {
		this.links = links;
		return this;
	}
	
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Payment)) return false;
		final Payment other = (Payment) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$id = this.getId();
		final java.lang.Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final java.lang.Object this$intent = this.getIntent();
		final java.lang.Object other$intent = other.getIntent();
		if (this$intent == null ? other$intent != null : !this$intent.equals(other$intent)) return false;
		final java.lang.Object this$payer = this.getPayer();
		final java.lang.Object other$payer = other.getPayer();
		if (this$payer == null ? other$payer != null : !this$payer.equals(other$payer)) return false;
		final java.lang.Object this$payee = this.getPayee();
		final java.lang.Object other$payee = other.getPayee();
		if (this$payee == null ? other$payee != null : !this$payee.equals(other$payee)) return false;
		final java.lang.Object this$cart = this.getCart();
		final java.lang.Object other$cart = other.getCart();
		if (this$cart == null ? other$cart != null : !this$cart.equals(other$cart)) return false;
		final java.lang.Object this$transactions = this.getTransactions();
		final java.lang.Object other$transactions = other.getTransactions();
		if (this$transactions == null ? other$transactions != null : !this$transactions.equals(other$transactions)) return false;
		final java.lang.Object this$failedTransactions = this.getFailedTransactions();
		final java.lang.Object other$failedTransactions = other.getFailedTransactions();
		if (this$failedTransactions == null ? other$failedTransactions != null : !this$failedTransactions.equals(other$failedTransactions)) return false;
		final java.lang.Object this$state = this.getState();
		final java.lang.Object other$state = other.getState();
		if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
		final java.lang.Object this$experienceProfileId = this.getExperienceProfileId();
		final java.lang.Object other$experienceProfileId = other.getExperienceProfileId();
		if (this$experienceProfileId == null ? other$experienceProfileId != null : !this$experienceProfileId.equals(other$experienceProfileId)) return false;
		final java.lang.Object this$noteToPayer = this.getNoteToPayer();
		final java.lang.Object other$noteToPayer = other.getNoteToPayer();
		if (this$noteToPayer == null ? other$noteToPayer != null : !this$noteToPayer.equals(other$noteToPayer)) return false;
		final java.lang.Object this$redirectUrls = this.getRedirectUrls();
		final java.lang.Object other$redirectUrls = other.getRedirectUrls();
		if (this$redirectUrls == null ? other$redirectUrls != null : !this$redirectUrls.equals(other$redirectUrls)) return false;
		final java.lang.Object this$failureReason = this.getFailureReason();
		final java.lang.Object other$failureReason = other.getFailureReason();
		if (this$failureReason == null ? other$failureReason != null : !this$failureReason.equals(other$failureReason)) return false;
		final java.lang.Object this$createTime = this.getCreateTime();
		final java.lang.Object other$createTime = other.getCreateTime();
		if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
		final java.lang.Object this$updateTime = this.getUpdateTime();
		final java.lang.Object other$updateTime = other.getUpdateTime();
		if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime)) return false;
		final java.lang.Object this$links = this.getLinks();
		final java.lang.Object other$links = other.getLinks();
		if (this$links == null ? other$links != null : !this$links.equals(other$links)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Payment;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final java.lang.Object $intent = this.getIntent();
		result = result * PRIME + ($intent == null ? 43 : $intent.hashCode());
		final java.lang.Object $payer = this.getPayer();
		result = result * PRIME + ($payer == null ? 43 : $payer.hashCode());
		final java.lang.Object $payee = this.getPayee();
		result = result * PRIME + ($payee == null ? 43 : $payee.hashCode());
		final java.lang.Object $cart = this.getCart();
		result = result * PRIME + ($cart == null ? 43 : $cart.hashCode());
		final java.lang.Object $transactions = this.getTransactions();
		result = result * PRIME + ($transactions == null ? 43 : $transactions.hashCode());
		final java.lang.Object $failedTransactions = this.getFailedTransactions();
		result = result * PRIME + ($failedTransactions == null ? 43 : $failedTransactions.hashCode());
		final java.lang.Object $state = this.getState();
		result = result * PRIME + ($state == null ? 43 : $state.hashCode());
		final java.lang.Object $experienceProfileId = this.getExperienceProfileId();
		result = result * PRIME + ($experienceProfileId == null ? 43 : $experienceProfileId.hashCode());
		final java.lang.Object $noteToPayer = this.getNoteToPayer();
		result = result * PRIME + ($noteToPayer == null ? 43 : $noteToPayer.hashCode());
		final java.lang.Object $redirectUrls = this.getRedirectUrls();
		result = result * PRIME + ($redirectUrls == null ? 43 : $redirectUrls.hashCode());
		final java.lang.Object $failureReason = this.getFailureReason();
		result = result * PRIME + ($failureReason == null ? 43 : $failureReason.hashCode());
		final java.lang.Object $createTime = this.getCreateTime();
		result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
		final java.lang.Object $updateTime = this.getUpdateTime();
		result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
		final java.lang.Object $links = this.getLinks();
		result = result * PRIME + ($links == null ? 43 : $links.hashCode());
		return result;
	}
}