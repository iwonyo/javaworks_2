package whileif;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		//y - "계속 반복합니다", n - "반복을 중단합니다."
		//그 이외의 키는 "지원하지 않는 키입니다."
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) : ");
			
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) { //equals() 문자열 비교함수
				System.out.println("계속 반복합니다.");
			}
			else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}
			else {
				System.out.println("지원하지 않는 키입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
