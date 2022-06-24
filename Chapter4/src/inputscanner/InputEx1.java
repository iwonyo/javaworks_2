package inputscanner;

import java.util.Scanner;
public class InputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.nextLine();
		System.out.println("이름 :" + name);
		
		System.out.print("당신의 나이는 몇 세인가요? ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		sc.close();
	}
}
