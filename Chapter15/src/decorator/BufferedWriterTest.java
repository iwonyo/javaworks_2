package decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterTest {

	public static void main(String[] args) {
		try(Writer fr = new FileWriter("lang.txt");
			BufferedWriter bw = new BufferedWriter(fr)){
			bw.write("Java");
			bw.newLine();
			bw.write("Python");
			bw.newLine();
			bw.write("C++");
			bw.newLine();
			bw.write("JavaScript");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("쓰기 완료");
	}
}
