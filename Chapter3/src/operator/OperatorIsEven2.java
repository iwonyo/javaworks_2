package operator;

import java.util.Scanner;

public class OperatorIsEven2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int num = scanner.nextInt();
		
		String str = (num % 2 ==  0) ? "Â¦¼ö" : "È¦¼ö";
		System.out.println(str);
		
		/*
		if(num%2==0) 
		    System.out.println("Â¦¼ö");
		else
		    System.out.println("È¦¼ö");
		*/
		
		scanner.close();
	}
}
