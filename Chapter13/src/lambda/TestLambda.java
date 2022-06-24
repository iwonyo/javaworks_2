package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		//람다식을 인터페이스형 변수에 대입
		PrintString lambdaStr = s -> System.out.println(s);  
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);  //매개변수로 람다식을 대입한 변수 전달
		
		PrintString reStr = returnString();  //변수로 반환받기
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {  //람다식을 반환하는 메서드
		return s -> System.out.println(s + "world");
	}

}
