package input_example;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("���ڳ� ���ڸ� ���� [Enter]�� �������� ");
		int i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	}
}
