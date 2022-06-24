package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		//관계(비교) 연산자
		System.out.println(7 < 3);
		System.out.println(7 > 3);
		System.out.println(7 == 3);
		System.out.println(7 !=  3);
		
		//논리 연산자
		System.out.println((7 > 3) && (5 > 2));
		System.out.println((7 > 3) || (5 < 2));  //단락 회로
		System.out.println(!(7 > 3));
	}
}
