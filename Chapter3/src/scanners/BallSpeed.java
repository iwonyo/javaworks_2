package scanners;

import java.util.Scanner;

public class BallSpeed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final Double RATE_KPH_MPH = 1.609344; //변환 상수
		Double kph = 0.0;
		Double mph = 0.0;
		
		System.out.print("당신의 구속을 입력하세요(km/h) : ");
		kph = scan.nextDouble();
		
		mph = kph / RATE_KPH_MPH;
		
		System.out.printf("공의 속도는 %.2f[MPH]입니다.", mph);
		scan.close();
	}
}
