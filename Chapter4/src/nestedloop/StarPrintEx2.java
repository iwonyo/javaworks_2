package nestedloop;

public class StarPrintEx2 {

	public static void main(String[] args) {
		// star 
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5-i; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*"); 
			}
			System.out.println();  //행 바꿈
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j < i; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 1; j <= 6-i; j++) {
				System.out.print("*"); 
			}
			System.out.println();  //행 바꿈
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j < i; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 5; j >= i; j--) {
				System.out.print("*"); 
			}
			System.out.println();  //행 바꿈
		}
		
		//변수를 활용하기
		int row = 5;
		int star = 1;
		int space = row-1;
		
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= space; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if(i <= row) {
				space -= 1;
				star += 1;
			}
			System.out.println();
		}
	}
}
