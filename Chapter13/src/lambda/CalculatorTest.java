package lambda;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator add;
		//add = (x, y) -> {return x + y; }; 
		add = (x, y) -> x + y;
		System.out.println(add.calc(10, 20));
		
		Calculator sub = (x, y) -> x - y;
		System.out.println(sub.calc(10, 20));
		
		Calculator times = (x, y) -> x * y;
		System.out.println(times.calc(10, 20));
		
		Calculator div = (x, y) -> (double)x / y;
		System.out.println(div.calc(10, 20));

	}

}
