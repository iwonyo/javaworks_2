package polydowncasting.hero;

public class Archer extends Hero {
	public Archer(String name) {
		super(name);
	}
	
	public void fireArrow() {
		System.out.println("특기 : 불화살 쏘기");
	}
}
