package math_random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 선택 번호
		int[] selNumber = new int[6];  // 선택 번호 6개가 저장될 배열 생성
		int i;
		
		Random rand = new Random(3);  //선택 번호를 얻기 위한 객체 생성(seed값)
		System.out.print("선택 번호 : ");
		for(i=0; i<6; i++) {
			selNumber[i] = rand.nextInt(45) + 1;
			System.out.print(selNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 번호
		int[] winNumber = new int[6];
		rand = new Random(3);   //당첨 번호를 얻기 위해 객체 생성
		System.out.print("당첨 번호: ");
		for(i=0; i<6; i++) {
			winNumber[i] = rand.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 여부
		boolean result = Arrays.equals(selNumber, winNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
