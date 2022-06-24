package polydowncasting.hero;

public class Wizard extends Hero{
	public Wizard(String name) {
		super(name);
	}
	
	public void freezing() {
		System.out.println("특기 : 얼음 얼리기");
	}
}
