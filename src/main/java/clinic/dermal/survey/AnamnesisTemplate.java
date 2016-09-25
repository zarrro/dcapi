package clinic.dermal.survey;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnamnesisTemplate {

	@ResponseBody
	@RequestMapping("/anamnesisTemplate")
	@CrossOrigin(origins = "http://localhost:5555", maxAge = 3600, allowCredentials="true")
	public String template() {
		return "{ \"templateId\": \"001\","
				+ "\"questions\": [ \"Age\", \"Sex\", \"Race\", \"Is there any irritation?\"]" + "}";
	}
}