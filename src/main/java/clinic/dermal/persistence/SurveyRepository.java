package clinic.dermal.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import clinic.dermal.model.Survey;

public interface SurveyRepository extends MongoRepository<Survey, String>{

}
