package decorator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"))){
			osw.write("Hello, Java");
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
