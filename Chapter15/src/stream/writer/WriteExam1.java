package stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/IO/test3.txt");
		char[] data = "ȫ�浿".toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();

	}

}
