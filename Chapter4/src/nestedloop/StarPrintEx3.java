package nestedloop;

public class StarPrintEx3 {

	public static void main(String[] args) {
		// star 
		int i, j;
		int row = 5;
		int star = 1;
		int space = row-1;
		
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if(i <= row) {
				space -= 1;
				star += 2;
			}
			System.out.println();
		}
		
		//역 삼각형
		row = 5;
		space = 1;
		star = row+1;
		
		for(i = 1; i <= row; i++) {
			for(j = 1; j < space; j++) {
				System.out.print(" ");
			}
			for(j = 1; j < (row + star) - i; j++) {
				System.out.print("*");
			}
			if(i <= row) {
				space += 1;
				star -= 1;
			}
			System.out.println();
		}
		
		//다이아몬드
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if(i <= row / 2) {
				space -= 1;
				star += 2;
			}else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}
	}
}
