package clinic.dermal.configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import clinic.dermal.logic.DcMailSender;
import clinic.dermal.logic.EmailSenderService;
import clinic.dermal.logic.EmailSenderServiceImpl;
import clinic.dermal.logic.InvoiceCounterService;
import clinic.dermal.logic.InvoiceCounterServiceImpl;

/**
 * Configures beans specific to the DC logic.
 * 
 * @author zaro
 *
 */
@Configuration
public class DcConfiguration {

	@Value("${lastInvoiceIdFile}")
	private String lastInvoiceIdFile;

	@Bean
	public InvoiceCounterService getInvoiceCounter() throws IOException {

		BufferedReader fr = null;
		try {
			File f = new File(this.lastInvoiceIdFile);
			if (f.exists()) {
				if (f.isFile()) {
					fr = new BufferedReader(new FileReader(f));
					String lastIdStr = fr.readLine();
					return new InvoiceCounterServiceImpl(Integer.valueOf(lastIdStr), this.lastInvoiceIdFile);
				} else {
					throw new RuntimeException("cannot create file: " + f.getAbsolutePath());
				}
			} else {
				return new InvoiceCounterServiceImpl(1, this.lastInvoiceIdFile);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace(); // WTF
				}
			}
		}
	}
	
	@Bean
	public EmailSenderService createEmailSender() {
		return new EmailSenderServiceImpl();
	}
	
	@Bean
	public DcMailSender createDcMailSender() {
		return new DcMailSender();
	}

}
