package method;

public class Add {
	
	//두 수를 더하는 매서드 정의
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {
		//static 사용 - new 객체를 생성하지 않아도 실행 할 수 있음
		//즉, 클래스를 반드시 만들지 않더라도 실행 가능.
		
		int sum = add(10, 11);  //add() 메서드 호출
		System.out.println("두 수의 합 : " + sum);
	}
}
