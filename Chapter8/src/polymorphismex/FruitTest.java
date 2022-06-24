package polymorphismex;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.사과 |2.복숭아 |3.바나나 ");
		System.out.print("선택> ");
		int selectNo = scanner.nextInt();
		Fruit fruit;
		if(selectNo==1) {
			fruit = new Apple();
			fruit.showInfo();
		}else if(selectNo==2) {
			fruit = new Peach();
			fruit.showInfo();
		}else if(selectNo==3) {
			fruit = new Banana();
			fruit.showInfo();
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		scanner.close();
	}
}
