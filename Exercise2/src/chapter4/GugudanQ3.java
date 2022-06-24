package chapter4;

public class GugudanQ3 {

	public static void main(String[] args) {
		int dan;
		int times;
		for(dan=2; dan<10; dan++) {
			for(times=1; times<=dan; times++) {
				System.out.println(dan + "x" + times + "=" + dan*times);
			}
			System.out.println();
		}

	}

}
