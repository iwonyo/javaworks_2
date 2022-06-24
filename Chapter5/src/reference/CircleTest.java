package reference;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		c1.setPoint(2, 3);
		c1.showInfo();
		
		Circle c2 = new Circle(8);
		c2.setPoint(-4, 6);
		c2.showInfo();
	}

}
