package clinic.dermal.model;

import org.springframework.data.annotation.Id;

public class Survey {

	@Id
	private String id;
	private String itchy;
	private String hurts;
	private String hotfeel;
	private String coldfeel;
	private String duration;
	private String description;
	private String sex;
	private String age;
	private String email;
	private String confirmEmail;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItchy() {
		return itchy;
	}

	public void setItchy(String itchy) {
		this.itchy = itchy;
	}

	public String getHurts() {
		return hurts;
	}

	public void setHurts(String hurts) {
		this.hurts = hurts;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getColdfeel() {
		return coldfeel;
	}

	public void setColdfeel(String coldfeel) {
		this.coldfeel = coldfeel;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHotfeel() {
		return hotfeel;
	}

	public void setHotfeel(String hotfeel) {
		this.hotfeel = hotfeel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", itchy=" + itchy + ", hurts=" + hurts + ", hotfeel=" + hotfeel + ", coldfeel="
				+ coldfeel + ", duration=" + duration + ", description=" + description + ", sex=" + sex + ", age=" + age
				+ ", email=" + email + ", confirmEmail=" + confirmEmail + "]";
	}
}
