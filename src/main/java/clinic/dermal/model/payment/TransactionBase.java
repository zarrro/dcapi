package clinic.dermal.model.payment;

import java.util.List;

public class TransactionBase extends CartBase {

	/**
	 * List of financial transactions (Sale, Authorization, Capture, Refund) related to the payment.
	 */
	private List<RelatedResources> relatedResources;

	/**
	 * Identifier to the purchase unit corresponding to this sale transaction.
	 */
	private String purchaseUnitReferenceId;


	/**
	 * Default Constructor
	 */
	public TransactionBase() {
	}


	public List<RelatedResources> getRelatedResources() {
		return relatedResources;
	}


	public void setRelatedResources(List<RelatedResources> relatedResources) {
		this.relatedResources = relatedResources;
	}


	public String getPurchaseUnitReferenceId() {
		return purchaseUnitReferenceId;
	}


	public void setPurchaseUnitReferenceId(String purchaseUnitReferenceId) {
		this.purchaseUnitReferenceId = purchaseUnitReferenceId;
	}	
}
