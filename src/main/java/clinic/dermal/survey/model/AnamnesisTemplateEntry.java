package clinic.dermal.survey.model;

import java.util.List;

public class AnamnesisTemplateEntry {
	
	enum AnswerType {
		TEXT, NUMBER, ENUM
	}

	private String question;
	private AnswerType answerType;
	private List<String> answerOptions;
	private boolean required;

	public AnswerType getAnswerType() {
		return answerType;
	}

	public void setAnswerType(AnswerType answerType) {
		this.answerType = answerType;
	}

	public List<String> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(List<String> answerOptions) {
		this.answerOptions = answerOptions;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
