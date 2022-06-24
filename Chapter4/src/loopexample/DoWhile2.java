package loopexample;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("안녕하세요");
			n = sc.nextInt();
		}while(n!=0);
		
		System.out.println("반복 종료");
		sc.close();
	}
}
