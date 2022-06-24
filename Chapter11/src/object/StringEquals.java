package object;

public class StringEquals {
	public static void main(String[] args) {	
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println("*****equals() 메서드*****");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2)); //이미 재정의되어 있음
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		Student std1 = new Student(10001, "손흥민");
		Student std2 = new Student(10001, "손흥민");
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));	//재정의 하면 논리적으로 같아짐.
	}
}
