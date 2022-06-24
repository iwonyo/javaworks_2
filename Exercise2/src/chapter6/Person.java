package chapter6;

public class Person {
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void eatCoffee(Bdabang bdabang) {
		bdabang.eatCoffee(4000);
		money -= 4000;
	}
	
	public void showInfo() {
		System.out.println(name + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
