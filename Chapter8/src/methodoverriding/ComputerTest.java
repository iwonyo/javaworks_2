package methodoverriding;

class Calculator{
	double areaCircle(double radius) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14 * radius * radius;
	}
}

class Computer extends Calculator{
	@Override
	double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * radius * radius;
	}
	
}
public class ComputerTest {

	public static void main(String[] args) {
		int radius = 10;
		Calculator calculator = new Calculator();
		System.out.println("원의 면적 : " + calculator.areaCircle(radius));
		
		Computer computer = new Computer() ;
		System.out.println("원의 면적: " + computer.areaCircle(radius));
	}

}
