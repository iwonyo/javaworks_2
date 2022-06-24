package innerclass;

class A{
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class B{
		B(){
			System.out.println("B 객체가 생성됨");
		}
	}
	
	//정적 멤버 클래스
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
	}
	
	//local 클래스(method()를 호출할때만 실행)
	void method() {
		class D{
			D(){
				System.out.println("D 객체가 생성됨");
			}
		}
		D d = new D();
	}
}

public class ATest {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		A.C c = new A.C();
		
		a.method();
	}
}
