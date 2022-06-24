package interfaceex;

public class CalculatorTest2 {
	public static void main(String[] args) {
		//다형성으로 구현
		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc();
		//Calc calc2 = new Calc();       // 인터페이스이므로 인스턴스 생성 못함
		//Calc calc3 = new Calculator(); // 추상클래스이므로 인스턴스 생성 못함
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		//calc.showinfo()가 보이지 않음
		
		if(calc instanceof CompleteCalc) {
			CompleteCalc calculator = (CompleteCalc)calc;
			calculator.showInfo();
			
			calculator.description();
		}
	}
}
