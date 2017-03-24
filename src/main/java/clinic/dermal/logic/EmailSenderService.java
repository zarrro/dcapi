package clinic.dermal.logic;

import clinic.dermal.configuration.MailProperties;

public interface EmailSenderService {

	void sendEmail(MailProperties mail);
	
}
