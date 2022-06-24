package chapter5;

import java.util.Scanner;

public class InputDate {

	public static void main(String[] args) {
		//년도를 입력하면 윤년을 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요: ");
		int year = sc.nextInt();
		if((year%4==0 && year % 100 !=0) || year % 400  == 0) {
			System.out.println(year + "년은 윤년");
		}
		else {
			System.out.println(year + "년은 평년");
		}
		sc.close();
	}
}
