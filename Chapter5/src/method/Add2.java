package method;

class Calculator{
	
	int add(int n1, int n2) {
		return n1 + n2;
	}
}

public class Add2 {
	
	public static void main(String[] args) {
		
		Calculator addition = new Calculator();
		int sum = addition.add(10, 11);
		
		System.out.println("두 수의 합 : " + sum);
	}
}
