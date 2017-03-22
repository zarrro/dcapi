package clinic.dermal.logic;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;

import clinic.dermal.configuration.MailAddresses;
import clinic.dermal.model.Case;

public class DcMailSender {

	private final ExecutorService executor = Executors.newCachedThreadPool();

	@Autowired
	private MailAddresses addr;

	@Autowired
	private EmailSenderService ess;

	public void sendNewCaseForReview(Case c) {

		final File[] attachements = new File[] { c.getImage1(), c.getImage2() };
		final Case dc = c;

		Runnable sendMailTask = () -> {
			DcMailSender.this.ess.sendEmailWithAttechment(DcMailSender.this.addr.getNewcasefrom(),
					DcMailSender.this.addr.getNewcaseto(), dc.getPayerId() + "_" + dc.getPaymentId(),
					dc.getSurvey().toString(), false, attachements);
		};
		executor.submit(sendMailTask);
	}
}
