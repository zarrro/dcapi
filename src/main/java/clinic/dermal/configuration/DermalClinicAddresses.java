package clinic.dermal.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@Validated
@ConfigurationProperties(value = "mail.address")
public class DermalClinicAddresses {

	private String newcasefrom;
	private String newcaseto;

	public String getNewcasefrom() {
		return newcasefrom;
	}

	public void setNewcasefrom(String newcasefrom) {
		this.newcasefrom = newcasefrom;
	}

	public String getNewcaseto() {
		return newcaseto;
	}

	public void setNewcaseto(String newcaseto) {
		this.newcaseto = newcaseto;
	}
}
