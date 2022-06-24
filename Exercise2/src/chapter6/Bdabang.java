package chapter6;

public class Bdabang {
	String dabangName;
	int customerCount;
	int money;
	
	public Bdabang(String dabangName) {
		this.dabangName = dabangName;
	}
	
	public void eatCoffee(int money) {
		this.money += money;
		customerCount++;
	}
	
	public void showInfo() {
		System.out.println(dabangName + "손님은 " + customerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
