package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/IO/test.txt");
		int readByteNo;   //바이트 수 저장
		byte[] readBytes = new byte[3];  //읽은 데이터 저장
		/*
		while((readByteNo=is.read(readBytes)) != -1) {
			System.out.println(readByteNo);
		}*/
		String data = "";    //문자열로 변환하기
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			System.out.println(readByteNo);
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
