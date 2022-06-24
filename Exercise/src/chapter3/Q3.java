package chapter3;

public class Q3 {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		int num1 = 2;
		int num2 = 10;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		int num3 = 0b00000000000000000000000000000010;
		System.out.println(num3);
		int num4 = 0b11111111111111111111111111111101;
		System.out.println(num4);

	}

}
