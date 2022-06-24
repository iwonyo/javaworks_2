package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		System.out.println("*********생성자 정보************");
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("*********멤버변수(필드) 정보************");
		Field[] fields = strClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
//		
		System.out.println("*********메서드 정보************");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
