package loopexample;

public class GugudanFull {

	public static void main(String[] args) {
		//구구단 전체
		int i, j;
		/*for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}*/
		
		//단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				if(i < j)
					break;
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
