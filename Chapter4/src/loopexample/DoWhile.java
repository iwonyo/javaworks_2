package loopexample;

public class DoWhile {

	public static void main(String[] args) {
	
		int n = 0;
		int sum = 0;
		
		do {
			n++;
			sum += n;
			System.out.println("수행문");
		}while(n < 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
