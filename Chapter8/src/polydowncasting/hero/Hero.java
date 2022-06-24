package polydowncasting.hero;

public class Hero {
	String name;
	
	public Hero(String name) { this.name = name; }
	
	public void attack() {
		System.out.println("기본 : 주먹 지르기");
	}
	
	public void showInfo() {
		System.out.println("직업 : " + name);
	}
}
