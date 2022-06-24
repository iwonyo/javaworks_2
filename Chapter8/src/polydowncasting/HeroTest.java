package polydowncasting;

import java.util.ArrayList;

class Hero {
	String name;
	
	public Hero(String name) { 
		this.name = name; 
	}
	
	public void attack() {
		System.out.println("주먹 지르기");
	}
	
	public void showInfo() {
		System.out.println("직업 : " + name);
	}
}

class Warrior extends Hero{
	public Warrior(String name) {
		super(name);
	}
	
	public void groundCutting() {
		System.out.println("대지 가르기");
	}
}

class Archer extends Hero{
	public Archer(String name) {
		super(name);
	}
	
	public void fireArrow() {
		System.out.println("불화살 쏘기");
	}
}

class Wizard extends Hero{
	public Wizard(String name) {
		super(name);
	}
	
	public void freezing() {
		System.out.println("얼리기");
	}
}

public class HeroTest {

	public static void main(String[] args) {
		ArrayList<Hero> heroList = new ArrayList<>();
		heroList.add(new Warrior("전사"));
		heroList.add(new Archer("궁수"));
		heroList.add(new Wizard("마법사"));
		
		for(Hero hero : heroList) {
			hero.attack();
			if(hero instanceof Warrior) {
				Warrior war = (Warrior)hero;
				war.showInfo();
				war.groundCutting();;
			}
			else if(hero instanceof Archer) {
				Archer arc = (Archer)hero;
				arc.showInfo();
				arc.fireArrow();
			}
			else if(hero instanceof Wizard) {
				Wizard wiz = (Wizard)hero;
				wiz.showInfo();
				wiz.freezing();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
		

	}

}
