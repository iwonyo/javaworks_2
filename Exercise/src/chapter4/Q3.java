package chapter4;

public class Q3 {

	public static void main(String[] args) {
		int i, j;
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				if(j>i)
					break;
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}

	}

}
