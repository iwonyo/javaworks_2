package chapter8.q4;

public class Engineer extends Employee{
	private String skillset;
	
	public Engineer(String name, String skillset) {
		super(name);
		this.skillset = skillset;
	}
	
	public String getSkillset() {
		return skillset;
	}
	
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	
}
