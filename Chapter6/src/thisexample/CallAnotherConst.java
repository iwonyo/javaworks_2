package thisexample;

class Person{
	String name;
	int age;
	
	Person() {
		this("이름없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnSelf() {  //객체 반환 메서드
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnSelf();
		
		System.out.println(p);
		System.out.println(noName);
	}

}
