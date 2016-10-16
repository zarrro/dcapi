package clinic.dermal.survey.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Anamnesis {

	@Id
	private String id;
	private List<AnamnesisEntry> entries;
	private String templateId;

	public List<AnamnesisEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<AnamnesisEntry> entries) {
		this.entries = entries;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
