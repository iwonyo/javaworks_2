package singleton.car;

public class Car {
	private static int serialNum = 10000;
	private int carNumber;
	
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
}
