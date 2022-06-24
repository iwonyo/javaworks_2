package genericex.method;


public class MaxValueTest {

	public static void main(String[] args) {
		
		int max = maxValue(10, 7);
		System.out.println("max = " + max);

	}
	
	static int maxValue(int x, int y) {
		if(x > y)
			return x;
		else
			return y;
	}

}
