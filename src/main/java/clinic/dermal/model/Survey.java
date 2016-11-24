package clinic.dermal.model;

public class Survey {
	String itchy;
	String hurts;
	String description;
	String duration;
	String coldfeel;
	String hotfeel;
	String history;
	String sex;
	String age;
	String previousTreatment;
	String previousDiagnose;

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

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
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

	public String getPreviousTreatment() {
		return previousTreatment;
	}

	public void setPreviousTreatment(String previousTreatment) {
		this.previousTreatment = previousTreatment;
	}

	public String getPreviousDiagnose() {
		return previousDiagnose;
	}

	public void setPreviousDiagnose(String previousDiagnose) {
		this.previousDiagnose = previousDiagnose;
	}

	@Override
	public String toString() {
		return "Survey [itchy=" + itchy + ", hurts=" + hurts + ", description=" + description + ", duration="
				+ duration + ", coldfeel=" + coldfeel + ", hotfeel=" + hotfeel + ", history=" + history + ", sex="
				+ sex + ", age=" + age + ", previousTreatment=" + previousTreatment + ", previousDiagnose="
				+ previousDiagnose + "]";
	}

	public String getHotfeel() {
		return hotfeel;
	}

	public void setHotfeel(String hotfeel) {
		this.hotfeel = hotfeel;
	}
}
