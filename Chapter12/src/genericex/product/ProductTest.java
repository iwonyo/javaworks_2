package genericex.product;

public class ProductTest {

	public static void main(String[] args) {
		Product<TV> p1 = new Product<>();
		TV tv = new TV();
		p1.setKind(tv);
		tv.making();
		System.out.println(p1.getKind());
		
		Product<Car> p2 = new Product<>();
		Car car = new Car();
		p2.setKind(car);
		car.making();
		System.out.println(p2.getKind());
	}
}
