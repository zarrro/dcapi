package clinic.dermal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import clinic.dermal.logic.DcMailSender;
import clinic.dermal.logic.EmailSenderService;
import clinic.dermal.logic.EmailSenderServiceImpl;

@Configuration
public class EmailSenderConfiguration {

	@Bean
	public EmailSenderService createEmailSender() {
		return new EmailSenderServiceImpl();
	}
	
	@Bean
	public DcMailSender createDcMailSender() {
		return new DcMailSender();
	}
}
