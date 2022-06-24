package exercise;

public class Q2_gugu {

	public static void main(String[] args) {
		int i, j;
		for(i = 2; i < 10; i++) {
			if(i % 2 == 1)
				continue;
			for(j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "="+ i*j);
			}
			System.out.println();
		}
	}
}
