package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException{
		try(FileOutputStream fos = new FileOutputStream("out.txt")){
			fos.write(65);               //true¿Ã∏È √ﬂ∞°µ 
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Done");	
	}
}
