package nestedloop;

public class NestedLoopEx {

	public static void main(String[] args) {
		// ÁßÃ¸ for¹®
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				int num = i * 5 + j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
