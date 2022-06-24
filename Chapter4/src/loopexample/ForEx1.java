package loopexample;

public class ForEx1 {

	public static void main(String[] args) {
	
		int n = 0, sum = 0;
		for(n=1, sum = 0; n <= 10; n++) {
			sum += n;
		}
		System.out.println(sum);
		System.out.println(n);
	}
}
