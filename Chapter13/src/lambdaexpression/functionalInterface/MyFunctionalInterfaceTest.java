package lambdaexpression.functionalInterface;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {   //실행문이 2개
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");}; //실행문이 1개
		fi.method();
		
		fi = () -> System.out.println("method call3");  //실행문이 1개 (중괄호 삭제)
		fi.method();
		
		//MyFunctionalInterface.java가 필요없게 된다.
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call4");
			}
		};
		fi.method();
	}
}
