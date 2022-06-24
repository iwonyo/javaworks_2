package polydowncasting.hero;

public class HeroMain {
	public static void main(String[] args) {
		Hero[] hero = new Hero[3];
		hero[0] = new Warrior("전사");
		hero[1] = new Archer("궁수");
		hero[2] = new Wizard("마법사");
		
		for(int i=0; i<hero.length; i++) {
			hero[i].attack();
			if(hero[i] instanceof Warrior) {
				Warrior war = (Warrior)hero[i];
				war.showInfo();
				war.groundCutting();
			}else if(hero[i] instanceof Archer) {
				Archer arc = (Archer)hero[i];
				arc.showInfo();
				arc.fireArrow();
			}else if(hero[i] instanceof Wizard) {
				Wizard wiz = (Wizard)hero[i];
				wiz.showInfo();
				wiz.freezing();
			}
		}
	}
}
