package input_example;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) throws IOException{
		System.out.println("문자나 숫자를 쓰고 [Enter]를 누르세요 ");
		int i = 0;
		while((i=System.in.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
