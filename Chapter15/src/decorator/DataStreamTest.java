package decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('K');
			dos.writeInt(25);
			dos.writeFloat(3.14f);
			dos.writeUTF("고양이");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	
	}
}
