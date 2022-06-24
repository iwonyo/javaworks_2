package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam1 {

	public static void main(String[] args) throws IOException {
		FileInputStream is = new FileInputStream("input.txt");
		int readByte;
		while((readByte=is.read()) !=-1) {
			//System.out.println(readByte);
			System.out.print((char)readByte);
		}
		is.close();
	}

}
