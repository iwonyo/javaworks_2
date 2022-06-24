package chapter2;

public class BinaryTest {
	
	public static void main(String[] args) {
		//2진수를 음의 정수로 만드는 방법 - 2의 보수 법
		int num1 = 0b00000000000000000000000000000101;  
		int num2 = 0b11111111111111111111111111111011;  //보수에 1을 더함
		
		System.out.println(num1);  //5 
		System.out.println(num2);  //-5
		
		int sum = num1 + num2;
		System.out.println(sum);
	}
}
