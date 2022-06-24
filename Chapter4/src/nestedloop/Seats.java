package nestedloop;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		//좌석 줄 수 계산
		//입장객 수, 좌석 열의 개수
		Scanner sc = new Scanner(System.in);
		System.out.print("입장객 수 : ");
		int customNum = sc.nextInt();
		System.out.print("좌석 열 수 : ");
		int colNum = sc.nextInt();
		
		int rowNum;  //줄(행) 수
		
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else { //나머지 인원이 있는 경우 1줄 추가
			rowNum = customNum / colNum + 1;  
		}
		
		//좌석 배치 반복
		for(int i = 0; i < rowNum; i++) {  //줄
			for(int j = 1; j <= colNum; j++) { //열
				int seatNum = i * colNum + j;  //좌석 번호
				if(seatNum > customNum)
					break;
				System.out.print("좌석" + seatNum + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
