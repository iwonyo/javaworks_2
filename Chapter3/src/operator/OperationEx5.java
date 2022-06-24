package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5;    //00000101
		int num2 = 10;   //00001010
		int result = num1 & num2;  //00000000
		System.out.println(result);
		
		result = num1 | num2;      //00001111
		System.out.println(result);
			
		//비트 이동 연산자
		int val = 2;   //00000010  -> 10진수 2
		System.out.println(val << 1);  //00000100 -> 10진수 4
		System.out.println(val << 2);  //00001000 -> 10진수 8
		System.out.println(val);       
		System.out.println(val >> 1);  //00000001  -> 10진수 1
	}
}
