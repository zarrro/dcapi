package clinic.dermal.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
public class MongoConfiguration {

	/*
     * Factory bean that creates the com.mongodb.Mongo instance
     */
     public @Bean MongoClientFactoryBean mongo() {
          MongoClientFactoryBean mongo = new MongoClientFactoryBean();
          mongo.setHost("localhost");
          return mongo;
     }
     
     public @Bean MongoTemplate mongoTemplate(@Autowired Mongo mongo) throws Exception {
         return new MongoTemplate(mongo, "test");
     }
}
