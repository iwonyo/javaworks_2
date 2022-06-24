package stream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam1 {

	public static void main(String[] args) throws IOException{
		Reader reader = new FileReader("reader.txt");
		int readData;
		while((readData=reader.read()) !=-1) {
			System.out.print((char)readData);
		}
		reader.close();
	}
}
