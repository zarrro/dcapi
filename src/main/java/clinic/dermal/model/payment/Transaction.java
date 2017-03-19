package clinic.dermal.model.payment;

import java.util.List;

public class Transaction extends TransactionBase {

	/**
	 * Financial transactions related to a payment.
	 */
	private List<Transaction> transactions;

	/**
	 * Default Constructor
	 */
	public Transaction() {
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
