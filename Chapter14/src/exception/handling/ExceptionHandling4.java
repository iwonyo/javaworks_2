package exception.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		/*
		try(FileInputStream fis = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			e.printStackTrace();
		}	
		*/
		System.out.println("여기도 수행됩니다.");
	 }
}
