package clinic.dermal.model.payment;

public class InstallmentOption {

	/**
	 * Number of installments
	 */
	private int term;

	/**
	 * Monthly payment
	 */
	private Currency monthlyPayment;

	/**
	 * Discount amount applied to the payment, if any
	 */
	private Currency discountAmount;

	/**
	 * Discount percentage applied to the payment, if any
	 */
	private Percentage discountPercentage;

	/**
	 * Default Constructor
	 */
	public InstallmentOption() {
	}

	/**
	 * Parameterized Constructor
	 */
	public InstallmentOption(int term, Currency monthlyPayment) {
		this.term = term;
		this.monthlyPayment = monthlyPayment;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public Currency getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(Currency monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public Currency getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Currency discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Percentage getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Percentage discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
