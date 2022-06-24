package hero;

public class Hero {
	String job;
	
	public Hero(String job) {
		this.job = job;
	}
	
	public void attack() {
		System.out.println("주먹 지르기");
	}
	
	public void jobInfo() {
		System.out.println("직업 : " + job);
	}
}
