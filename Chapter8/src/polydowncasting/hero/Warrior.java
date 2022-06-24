package polydowncasting.hero;

public class Warrior extends Hero{
	public Warrior(String name) {
		super(name);
	}
	
	public void groundCutting() {
		System.out.println("특기 : 대지 가르기");
	}
}
