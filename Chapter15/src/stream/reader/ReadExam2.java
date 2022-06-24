package stream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam2 {

	public static void main(String[] args) throws IOException{
		Reader reader = new FileReader("C:/IO/test2.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while((readCharNo=reader.read(cbuf)) !=-1) {
			data += new String(cbuf, 0, readCharNo);
			System.out.println(readCharNo);
			System.out.println(data);
		}
		System.out.println(data);
		reader.close();
	}

}
