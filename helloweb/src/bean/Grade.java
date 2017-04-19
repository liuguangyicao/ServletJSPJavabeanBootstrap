package bean;

public class Grade {
	private String class_name;
	private String class_term;
	private String class_score;
	public Grade(){}
	public Grade(String class_name, String class_term, String class_score) {
		this.class_name = class_name;
		this.class_term = class_term;
		this.class_score = class_score;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_term() {
		return class_term;
	}
	public void setClass_term(String class_term) {
		this.class_term = class_term;
	}
	public String getClass_score() {
		return class_score;
	}
	public void setClass_score(String class_score) {
		this.class_score = class_score;
	}
	
	
	

}
