package input_example;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("문자나 숫자를 쓰고 [Enter]를 누르세요 ");
		int i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	}
}
