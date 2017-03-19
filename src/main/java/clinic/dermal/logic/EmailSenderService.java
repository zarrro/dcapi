package clinic.dermal.logic;

import java.io.File;

public interface EmailSenderService {

	void sendEmail(String from, String to, String subject, String body, boolean htmlContent);

	void sendEmailWithAttechment(String from, String to, String subject, String body, boolean htmlContent,
			File... attechements);
	
}
