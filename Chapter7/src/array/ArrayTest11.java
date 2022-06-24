package array;

public class ArrayTest11 {

	public static void main(String[] args) {
		int[] number1 = {1, 2, 3, 4};
		//int[] numbers1 = new int[]{1, 2, 3, 4};
		System.out.println();
		
		//배열의 길이
		System.out.printf("배열의 개수는 %d개입니다.\n", number1.length);
		
	    int[] number2 = new int[3];
	    number2[0] = 1;
	    number2[1] = 2;
	    number2[2] = 3;
	    System.out.printf("배열의 개수는 %d개입니다.", number2.length);
	}
}
