package chapter6;

public class EatCoffee {

	public static void main(String[] args) {
		Person kim = new Person("±è±â¿ë", 10000);
		Bdabang bstar = new Bdabang("bstar");
		kim.eatCoffee(bstar);
		kim.showInfo();
		bstar.showInfo();

	}

}
