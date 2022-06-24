package loopexample;

public class BreakEx {

	public static void main(String[] args) {
		//1부터 더했을때 그 합이 100이 넘는 자연수는 얼마일까?
		int n=0;
		int sum = 0;
		
		while(true) {
			sum += n;
			if(sum > 100)
			  break;
			n++;
		}
		
		System.out.println(sum);
		System.out.println(n);
	}
}
