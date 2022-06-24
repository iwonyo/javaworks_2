package loopexample;

public class BreakEx2 {

	public static void main(String[] args) {
		//1부터 더했을때 그 합이 100이 넘는 자연수는 얼마일까?
		int n = 0;
		int sum = 0;
	
		for(n = 0; ; n++) {
			sum += n;
			if(sum > 100)
			  break;
		}
		
		System.out.println(sum);
		System.out.println(n);
	}
}
