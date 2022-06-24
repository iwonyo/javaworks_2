package chapter2;

public class ConstantEx {
	public static void main(String[] args) {
		//상수로 선언하기
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		//MAX_NUM = 1000;  //final로 선언하면 변경할 수 없음
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);	
		
		// 원의 넓이 구하기(반지름*반지름*3.14)
		final double PI = 3.14;
		int radius = 5;
		double area = PI * radius * radius;
		System.out.println("원의 넓이는 " + area  + "입니다.");
	}
}
