package input_example;

import java.util.Scanner;

public class InputSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 : ");
		int customNum = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		int colNum = sc.nextInt();
		
		int rowNum = 0; //줄(행) 수
		
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {
			rowNum = customNum / colNum + 1;
		}
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		
		sc.close();
	}
}
