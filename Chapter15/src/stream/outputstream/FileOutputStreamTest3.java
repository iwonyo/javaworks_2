package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException{
		try(FileOutputStream fos = new FileOutputStream("out.txt", true)){
			fos.write(97);               //true¿Ã∏È √ﬂ∞°µ 
			fos.write(98);
			fos.write(99);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
}
