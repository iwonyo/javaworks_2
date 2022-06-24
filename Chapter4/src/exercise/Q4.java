package exercise;

public class Q4 {

	public static void main(String[] args) {
		int i, j;
		/*
		for(i=0; i<4; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(i=0; i<4; i++) {
			for(j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0; i<4; i++) {
			for(j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(j=0; j<4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
