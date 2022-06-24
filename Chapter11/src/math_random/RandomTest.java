package math_random;

import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		//System.out.println(dice);
		
		int dice1, dice2, total;
		for(int i=0; i<10; i++) {
			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			total = dice1 + dice2;
			System.out.println(total);
			if(total==7)
				System.out.println("Seven Thrown!!");
			if(total==10)
				System.out.println("Ten Thrown!!");
			if(dice1==dice2)
				System.out.println("Double Thrown!!");
		}	
	}
}
