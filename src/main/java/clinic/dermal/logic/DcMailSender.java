package clinic.dermal.logic;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;

import clinic.dermal.configuration.DermalClinicAddresses;
import clinic.dermal.model.Case;

public class DcMailSender {

	private final ExecutorService executor = Executors.newCachedThreadPool();

	@Autowired
	private DermalClinicAddresses addr;

	@Autowired
	private EmailSenderService ess;

	public void sendNewCaseForReview(Case c, File... files) {

		final File[] attachements = files;
		final Case dc = c;

		Runnable sendMailTask = () -> {
			DcMailSender.this.ess.sendEmailWithAttechment(DcMailSender.this.addr.getNewcasefrom(),
					DcMailSender.this.addr.getNewcaseto(), dc.getPaymentId(), dc.getSurvey().toString(), false,
					attachements);
		};
		executor.submit(sendMailTask);
	}
}
