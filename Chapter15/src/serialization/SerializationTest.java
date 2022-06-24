package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	private static final long serialVersionUID = -3250194140145292632L;
	String name;
	transient String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
        try(FileOutputStream fos = new FileOutputStream("serial.out"); 
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
             oos.writeObject(personAhn);     //personAhn의 값을 파일에 씀(직렬화)
        } catch (IOException e) {
            e.printStackTrace();
        }
		
       try(FileInputStream fis = new FileInputStream("serial.out"); 
           ObjectInputStream ois = new ObjectInputStream(fis)){
           Person p1 = (Person)ois.readObject();   //personAhn의 값을 파일에서 읽어 들임(역직렬화)
           System.out.println(p1);
//           Object obj = ois.readObject();
//            if(obj instanceof Person) {
//                Person p = (Person)obj;
//                System.out.println(p);
//            }
//			
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
