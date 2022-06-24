package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		//부호 연산자
		int num = 10;
		System.out.println(num);
		System.out.println(-num);  //부호만 바뀜
		System.out.println(num);
		
		//대입 연산자
		num = -num;
		System.out.println(num); 
	}
}
