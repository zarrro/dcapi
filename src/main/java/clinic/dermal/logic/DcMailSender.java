package clinic.dermal.logic;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;

import clinic.dermal.configuration.ConfirmationMailProperties;
import clinic.dermal.configuration.NewCaseMailProperties;
import clinic.dermal.model.Case;

public class DcMailSender {

	private final ExecutorService executor = Executors.newCachedThreadPool();

	@Autowired
	private EmailSenderService senderService;

	@Autowired
	private NewCaseMailProperties newCaseMail;

	@Autowired
	private ConfirmationMailProperties confirmationMail;

	public void sendNewCaseForReview(Case c) {
		newCaseMail.setSubject(newCaseMail.getSubject() + " " + c.getPaymentId());
		newCaseMail.setBody(c.toString());
		newCaseMail.setAttachements(new File[] { c.getImage1(), c.getImage2() });

		confirmationMail.setTo(c.getSurvey().getEmail());

		DcMailSender mail = DcMailSender.this;
		Runnable sendMailTask = () -> {
			mail.senderService.sendEmail(newCaseMail);
			mail.senderService.sendEmail(confirmationMail);
		};

		executor.submit(sendMailTask);
	}
}