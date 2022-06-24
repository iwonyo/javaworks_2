package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		//단락회로 평가 실습
		int n = 10;
		int i = 2;
		boolean value = ((n = n + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);  //false
		System.out.println(n);      //20
		System.out.println(i);      //2
		
		System.out.println("------");
		value = ((n = n + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);  //true
		System.out.println(n);      //30
		System.out.println(i);      //2
	}
}
