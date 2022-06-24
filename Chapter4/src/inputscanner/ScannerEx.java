package inputscanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.println("이름 " + name);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		System.out.println("나이 : " + age);
		scanner.close();
	}

}
