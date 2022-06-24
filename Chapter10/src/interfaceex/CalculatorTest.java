package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		CompleteCalc calc = new CompleteCalc();  
		//Calc calc2 = new Calc();       // 인터페이스이므로 인스턴스 생성 못함
		//Calc calc3 = new Calculator(); // 추상클래스이므로 인스턴스 생성 못함
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2)); 
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		Calc calc2 = new CompleteCalc();    //묵시적 형변환
		
		if(calc2 instanceof CompleteCalc) {
			CompleteCalc calc3 = (CompleteCalc)calc2;
			calc3.showInfo();
		}
	
		System.out.println(calc.square(num1));
		System.out.println(calc.square(num2));
		
		calc.description();
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(numbers));
		
	}
}
