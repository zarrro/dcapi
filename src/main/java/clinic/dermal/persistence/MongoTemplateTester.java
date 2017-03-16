package clinic.dermal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController - uncomment to test
public class MongoTemplateTester {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping("mongotest")
	public ResponseEntity<Integer> test() {

		Query query = new Query(Criteria.where("_id").is("invoiceSeq"));
		Update update = new Update().inc("seq", 1);
		Counter c = mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true).upsert(true),
				Counter.class);

		System.out.println("set = " + c.getSeq());

		ResponseEntity<Integer> res = new ResponseEntity<Integer>(c.getSeq(), HttpStatus.OK);
		return res;
	}

}
