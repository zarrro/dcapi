package clinic.dermal.configuration;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@Validated
@ConfigurationProperties(value = "mail.smtp")
public class SmtpConnectionProperties {

	@NotBlank
	private String host;
	private String port;
	private String auth;
	private String username;
	private String password;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String isAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * During MailConfiguration bean initialization, mail related system
	 * properties are set. These are used directly from System.getProrties()
	 * after that.
	 */
	@PostConstruct
	public void populateMailConfigurationSystemProprties() {
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", this.host);
		props.setProperty("mail.smtp.user", this.username);
		props.setProperty("mail.smtp.port", port);
		props.setProperty("mail.smtp.socketFactory.port", port);
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.auth", this.auth);
	}
	
	public Properties getSessionProperties() {
		return System.getProperties();
	}
}