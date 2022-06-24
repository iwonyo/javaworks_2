package loopexample;

public class While1to10 {

	public static void main(String[] args) {
		//1~4까지 더하기
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		System.out.println("num = " + num);
	
		//1부터 10까지의 합계
		int n = 0;    //반복 변수
		int sum = 0;  //합계
		
		while(n < 10) {
			n++;
			sum += n;  //sum = sum + n
			System.out.println("n = " + n + ", sum = " + sum);
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
