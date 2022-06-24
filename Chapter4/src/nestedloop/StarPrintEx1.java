package nestedloop;

public class StarPrintEx1 {

	public static void main(String[] args) {
		// star 
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//변수를 활용하기
		int row = 5;
		int star = 0;
		
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= star+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
