package exercise.q5;

public class CalcTest {

	public static void main(String[] args) {
		Calc sum;
		sum = (x, y) -> x + y;
		System.out.println(sum.add(100, 200));
	}
}
