package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');    //문자 1개
			fw.write("안녕하세요");  //문자열
			char[] buf = {'B', 'C', 'D', 'E', 'F'};
			fw.write(buf);   //배열
			fw.write(buf, 1, 2);
			fw.write(10);
			fw.write(100);
			int num = 20;
			fw.write(num);   //코드값이 출력됨
			//fw.write(3.14);   //정수나 실수는 사용할 수 없음
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}
