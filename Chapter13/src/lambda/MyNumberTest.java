package lambda;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber sum;
		sum = (x, y) -> x + y;
		System.out.println(sum.add(3, 7));
		
		int total = add(5, 15);
		System.out.println(total);
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
}
