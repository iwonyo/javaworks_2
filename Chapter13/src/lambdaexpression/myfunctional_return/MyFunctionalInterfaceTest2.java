package lambdaexpression.myfunctional_return;

public class MyFunctionalInterfaceTest2 {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) ->  x + y;  //중괄호와 return 생략
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
