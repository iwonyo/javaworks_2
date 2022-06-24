package loopexample;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("안녕하세요.");
		while(n != 0) {
			n = sc.nextInt();
			System.out.println("안녕하세요.");
		}
		
		System.out.println("반복 종료");
		sc.close();
	}
}
