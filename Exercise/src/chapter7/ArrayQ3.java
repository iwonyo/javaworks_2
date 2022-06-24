package chapter7;

public class ArrayQ3 {

	public static void main(String[] args) {
		int[] number = new int[] {2, 4, 6, 8, 10};
		
		int sum = 0;
		for(int i=0; i<number.length; i++) {
			sum += number[i];
		}
		System.out.println("1부터 10까지 짝수의 합은"+sum+"입니다.");
		
		/*
		int j=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				number[j] = i;
				j++;
			}
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}*/
				
		
	}
}
