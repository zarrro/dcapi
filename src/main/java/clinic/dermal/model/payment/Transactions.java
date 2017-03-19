package clinic.dermal.model.payment;

public class Transactions {

	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Default Constructor
	 */
	public Transactions() {
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}
}
