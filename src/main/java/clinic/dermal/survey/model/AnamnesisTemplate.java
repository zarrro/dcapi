package clinic.dermal.survey.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnamnesisTemplate {

	@Id
	private String id;

	private List<AnamnesisTemplateEntry> entries;

	public List<AnamnesisTemplateEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<AnamnesisTemplateEntry> entries) {
		this.entries = entries;
	}

}