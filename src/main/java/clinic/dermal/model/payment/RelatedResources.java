package clinic.dermal.model.payment;

public class RelatedResources {

	/**
	 * Sale transaction
	 */
	private Sale sale;

	/**
	 * Authorization transaction
	 */
	private Authorization authorization;

	/**
	 * Order transaction
	 */
	private Order order;

	/**
	 * Capture transaction
	 */
	private Capture capture;

	/**
	 * Refund transaction
	 */
	private Refund refund;

	/**
	 * Default Constructor
	 */
	public RelatedResources() {
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Authorization getAuthorization() {
		return authorization;
	}

	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Capture getCapture() {
		return capture;
	}

	public void setCapture(Capture capture) {
		this.capture = capture;
	}

	public Refund getRefund() {
		return refund;
	}

	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	

}
