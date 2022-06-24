package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;   //내부 클래스 자료형 변수 
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//인스턴스 내부 클래스
	class InClass{  
		int inNum = 100;
		void inTest() {
			System.out.println(num + "(외부 클래스의 인스턴스 변수)");
			System.out.println(sNum + "(외부 클래스의 정적 변수)");
			System.out.println(inNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("**외부 클래스를 이용하여 내부 클래스 기능 호출 - 방법1**");
		outClass.usingClass();
		
		System.out.println("**외부 클래스를 이용하여 내부 클래스 기능 호출 - 방법2**");
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
	}
}
