package polymorphismex;

public class Fruit {
	String name;
	int price;
	int freshness;
	
	public void showInfo() {
		System.out.println("과일 이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("신선도 : " + freshness);
	}
}
