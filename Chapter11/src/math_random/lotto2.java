package math_random;

import java.util.Random;

public class lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];  //로또 6자리 공간
		
		Random rand = new Random();
		System.out.print("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.print(lotto[i] + " ");
		}
	}

}
