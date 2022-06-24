package operator;

public class OperatorIsEven {

	public static void main(String[] args) {
		// 11이 짝수인 경우 True, 아니면 False 출력
		int num = 11;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		System.out.println(isEven);
		
		String str = (num % 2 ==  0) ? "짝수" : "홀수";
		System.out.println(str);
	}

}
