package clinic.dermal.configuration;

import java.io.File;
import java.util.Arrays;

public class MailProperties {
	
	protected String from;
	protected String to;
	protected String subject;
	protected String body;
	protected File[] attachements;
	protected boolean htmlContent;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public File[] getAttachements() {
		return attachements;
	}

	public void setAttachements(File[] attachements) {
		this.attachements = attachements;
	}

	public boolean isHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(boolean htmlContent) {
		this.htmlContent = htmlContent;
	}

	@Override
	public String toString() {
		return "MailProperties [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body
				+ ", attachements=" + Arrays.toString(attachements) + ", htmlContent=" + htmlContent + "]";
	}
}
