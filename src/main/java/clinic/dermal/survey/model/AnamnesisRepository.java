package clinic.dermal.survey.model;

import org.springframework.data.mongodb.repository.MongoRepository;

//@RepositoryRestResource(collectionResourceRel = "anamnesises", path = "anamnesises")
public interface AnamnesisRepository extends MongoRepository<Anamnesis, String> {

}
