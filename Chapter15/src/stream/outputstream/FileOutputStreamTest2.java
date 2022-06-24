package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output.txt");
		try(fos){
			byte[] bs = new byte[26];
			byte data = 'A';
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);     //배열을 한꺼번에 출력
			fos.write(10);     //아스키 코드 10(LF-new line)
			fos.write(bs, 3, 10);
		}catch(IOException e) {
			System.out.println(e);
		}	
		System.out.println("출력 완료");
	}
}
