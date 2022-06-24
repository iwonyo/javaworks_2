package inputscanner;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;  //잔액
		String selectNo = "";  //메뉴 번호
		int money = 0;    //입,출금액
				
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			selectNo = scanner.next();
			
			switch(selectNo){
			case "1":
				while(true) {
					System.out.println("예금액> ");
					money = scanner.nextInt();
					if(money < 1000) {
						System.out.println("초기 입금액은 1000원 이상입니다. 다시 입력하세요");
					}
					else {
						balance += money;
						System.out.printf("%,d원 정상처리 되었습니다.\n", money);
						break;
					}
				}
				break;
			case "2":
				while(true) {
					System.out.println("출금액> ");
					money = scanner.nextInt();
					if(money > balance || money < 0) {
						System.out.println("잔액이 부족합니다. 다시 입력하세요");
					}
					else {
						balance -= money;
						System.out.printf("%,d원 정상처리 되었습니다.\n", money);
						break;
					}
				}
				break;
			case "3":
				System.out.printf("잔고> %,d원\n", balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}

