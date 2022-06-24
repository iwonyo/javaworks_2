package operator;

public class Swap {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int temp;
		
		System.out.println("교환전");
		System.out.println("x = " + x + ", y= " + y);
		
		//교환 처리
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교환후");
		System.out.println("x = " + x + ", y= " + y);
	}
}
