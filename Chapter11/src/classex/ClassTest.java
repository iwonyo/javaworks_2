package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass = person.getClass();
		System.out.println(pClass);
		System.out.println(pClass.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class strClass2 = Class.forName("java.lang.String2");
		System.out.println(strClass.getName());
		
		System.out.println("*********생성자 정보************");
		Constructor[] cons = pClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("*********멤버변수(필드) 정보************");
		Field[] fields = pClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("*********메서드 정보************");
		Method[] methods = pClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
