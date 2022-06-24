package array;

public class ArrayDeliverTest {

	public static void main(String[] args) {
		int sum;
		
		sum = add(new int[] {90, 77, 83});
		System.out.println("รัวี  : " + sum);
	}
	
	public static int add(int[] score) {
		int total = 0;
		int i;
		for(i=0; i<score.length; i++) {
			total += score[i];
		}
		return total;
	}

}
