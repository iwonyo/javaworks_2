package scanners;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하세요 : ");
		String name = scan.nextLine(); //고객 이름
		
		System.out.print("구매 금액을 입력하세요 : ");
		int price = scan.nextInt();  //가격
		int bonusPoint = 0;          //보너스 포인트
		double bonusRatio = 0.05;    //보너스적립율 : 5%
		
		//보너스포인트 = 가격 x 보너스적립율
		bonusPoint = (int)(price * bonusRatio);
		System.out.println(name + " 님의 보너스 포인트는 " + bonusPoint + "점입니다." );
	
		scan.close();
	}
}
