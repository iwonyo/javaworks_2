package exercise;

public class Q4_star {

	public static void main(String[] args) {
		int lineCount = 4;   //줄 개수
		int starCount = 1;   //별의 개수
		int spaceCount = lineCount - 1;   //공백의 개수
		int i, j;
		
		for(i = 0; i < lineCount; i++) {
			for(j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			spaceCount -= 1;  //공백은 1개 감소
			starCount += 2;   //별은 2개 증가
			System.out.println();
		}
	}
}
