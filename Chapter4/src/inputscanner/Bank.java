package inputscanner;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			if(selectNo==1) {
				System.out.print("예금액> ");
				int in = sc.nextInt();
				//balance += sc.nextInt();
				balance += in;
			}else if(selectNo==2) {
				System.out.print("출금액> ");
				int out = sc.nextInt();
				//balance -= sc.nextInt();
				balance -= out;
			}else if(selectNo==3) {
				System.out.println("잔고> " + balance);
			}else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
