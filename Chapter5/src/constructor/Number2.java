package constructor;

public class Number2 {
	
	int x;
	
	public Number2(int y) {
		x = y;
	}

	public static void main(String[] args) {
		Number2 myObj = new Number2(5);
		System.out.println(myObj.x);
	}

}
