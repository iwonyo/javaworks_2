package others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException{
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);   //int형 4바이트이므로 4번째 위치함
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);  //double형 8바이트로 12번째 위치
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("강아지");   //한 문자당 3byte + 2(Null char)
		System.out.println(rf.getFilePointer());
		
		rf.seek(0);  //파일 포인터 위치 이동. 맨 앞
	  
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
