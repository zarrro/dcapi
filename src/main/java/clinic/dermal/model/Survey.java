package clinic.dermal.model;

public class Survey {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((coldfeel == null) ? 0 : coldfeel.hashCode());
		result = prime * result + ((confirmEmail == null) ? 0 : confirmEmail.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((hotfeel == null) ? 0 : hotfeel.hashCode());
		result = prime * result + ((hurts == null) ? 0 : hurts.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itchy == null) ? 0 : itchy.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (coldfeel == null) {
			if (other.coldfeel != null)
				return false;
		} else if (!coldfeel.equals(other.coldfeel))
			return false;
		if (confirmEmail == null) {
			if (other.confirmEmail != null)
				return false;
		} else if (!confirmEmail.equals(other.confirmEmail))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hotfeel == null) {
			if (other.hotfeel != null)
				return false;
		} else if (!hotfeel.equals(other.hotfeel))
			return false;
		if (hurts == null) {
			if (other.hurts != null)
				return false;
		} else if (!hurts.equals(other.hurts))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itchy == null) {
			if (other.itchy != null)
				return false;
		} else if (!itchy.equals(other.itchy))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
}
