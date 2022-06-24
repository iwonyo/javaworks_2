package chapter4;

public class ContinueQ2 {

	public static void main(String[] args) {
		int dan;
		int times;
		for(dan=2; dan<10; dan++) {
			if(dan % 2 == 1)
				continue;
			for(times=1; times<10; times++) {
				System.out.println(dan + "x" + times + "=" + dan*times);
			}
			System.out.println();
		}
	}

}
