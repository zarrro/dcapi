package clinic.dermal.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "mail.newcase")
public class NewCaseMailProperties extends MailProperties {

}
