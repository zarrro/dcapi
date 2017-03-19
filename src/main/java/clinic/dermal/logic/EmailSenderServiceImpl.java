package clinic.dermal.logic;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import clinic.dermal.configuration.SmtpConnectionProperties;

public class EmailSenderServiceImpl implements EmailSenderService {

	@Autowired
	private SmtpConnectionProperties smtpConfig;

	private final Logger LOG = LoggerFactory.getLogger(EmailSenderService.class);

	@Override
	public void sendEmailWithAttechment(String from, String to, String subject, String body, boolean htmlContent,
			File... attachments) {
		LOG.info("Start sending email with...");
		LOG.info("from: {}, to: {}, subject {}, html: {}, body:\n {}", from, to, subject, htmlContent, body);

		try {
			Session session =
					Session.getDefaultInstance(this.smtpConfig.getSessionProperties(), new javax.mail.Authenticator() {
						@Override
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(EmailSenderServiceImpl.this.smtpConfig.getUsername(),
									EmailSenderServiceImpl.this.smtpConfig.getPassword());
						}
					});

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(subject);

			BodyPart messageBodyPart = new MimeBodyPart();

			if (htmlContent) {
				messageBodyPart.setContent(body, "text/html");
			} else {
				messageBodyPart.setText(body);
			}
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);

			// Part two is attachment
			for (File f : attachments) {
				messageBodyPart = new MimeBodyPart();
				DataSource source = new FileDataSource(f);
				messageBodyPart.setDataHandler(new DataHandler(source));
				messageBodyPart.setFileName(f.getName());
				multipart.addBodyPart(messageBodyPart);
			}
			message.setContent(multipart);
			Transport.send(message);
			LOG.info("Sent email successfully....");
		} catch (MessagingException e) {
			LOG.error("Error sending email...", e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public void sendEmail(String from, String to, String subject, String body, boolean htmlContent) {
		throw new RuntimeException("not implemented");
	}
}
