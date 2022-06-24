package ifExample;

public class ifexample4 {

	public static void main(String[] args) {
		//두 수 중 큰 수 비교
		
		int a = 10;
		int b = 20;
		int max = 0;
		/*
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}*/
		max = (a > b) ? a : b;
		System.out.println("최대값은 : " + max);

	}

}
