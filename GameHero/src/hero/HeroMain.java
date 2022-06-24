package hero;

public class HeroMain {

	public static void main(String[] args) {
		Hero hero = new Warrior("ภüป็");
		Warrior war =(Warrior)hero;
		war.jobInfo();
		war.attack();
		war.groundCutting();	
	}
}
