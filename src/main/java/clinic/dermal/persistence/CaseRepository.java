package clinic.dermal.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import clinic.dermal.model.Case;

public interface CaseRepository extends MongoRepository<Case, String>{
	
	Case findByPaymentId(String paymentId);

}
