package chapter5;

public class Calculator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//int num2 = 0;
		
		int result = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");
		
		result = subtract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");
		
		result = times(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");
		
		divide(num1, num2);
		
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int times(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static void divide(int n1, int n2) {
		if(n2==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
		}
		else {
			double result = (double)n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + result + "입니다.");
		}
	}
}
