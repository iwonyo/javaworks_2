package singleton.car;

public class MainClass {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNumber());
		System.out.println(yourSonata.getCarNumber());
	}
}
