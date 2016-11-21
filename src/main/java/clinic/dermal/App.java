package clinic.dermal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import clinic.dermal.configuration.StorageProperties;

/**
 * @author peevs
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
}
