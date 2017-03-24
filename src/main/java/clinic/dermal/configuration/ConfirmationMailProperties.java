package clinic.dermal.configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "mail.confirm")
public class ConfirmationMailProperties extends MailProperties {

	private String bodyfile;
	
	@PostConstruct
	private void initBody() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(this.bodyfile));
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				content.append(line);
			}
			this.setBody(content.toString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String getBodyfile() {
		return bodyfile;
	}

	public void setBodyfile(String bodyFile) {
		this.bodyfile = bodyFile;
	}
}
