package operator;

public class Operation_increase {

	public static void main(String[] args) {
		//증가, 감소 연산자
		int num = 10;
		
		//System.out.println(num);
		//System.out.println(num++);
		
		System.out.println(++num);
		System.out.println(num);
		
		//후 증가연산자 사용 예(다음 처리문이 있을때 증가함)
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
	}

}
