package polymorphism;

import java.util.Scanner;

class Fruit{
	String name;
	int price;
	int freshness;
	
	public void showFruitInfo() {
		System.out.println("과일 이름 : " + name);
		System.out.println("가격 : " + price); 
		System.out.println("신선도 : " + freshness);
	}
}

class Apple extends Fruit{
	public Apple() {
		name = "사과";
		price = 2000;
		freshness = 90;
	}
}

class Peach extends Fruit{
	public Peach() {
		name = "복숭아";
		price = 1500;
		freshness = 85;
	}
}

class Banana extends Fruit{
	public Banana() {
		name = "바나나";
		price = 1000;
		freshness = 75;
	}
}

public class FruitMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.사과 | 2.복숭아 | 3.바나나");
		System.out.println("선택> ");
		int menu = sc.nextInt();
		Fruit fruit;
		switch(menu){
		case 1:
			fruit = new Apple();
			fruit.showFruitInfo();
			break;
		case 2:
			fruit = new Peach();
			fruit.showFruitInfo();
			break;
		case 3:
			fruit = new Banana();
			fruit.showFruitInfo();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");	
			break;
		}

	}

}


















