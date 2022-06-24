package scanners;

import java.util.Scanner;

public class InputIsEven {

	public static void main(String[] args) {
		// 수를 입력받아서 짝수,홀수 판별하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		String str = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(str);
		sc.close();
	}
}
