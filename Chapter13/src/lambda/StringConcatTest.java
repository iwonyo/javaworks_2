package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		System.out.println("***일반 구현 클래스***");
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		System.out.println("***람다식으로 구현하기***");
		StringConcat concat1 = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat1.makeString("hello", "java");
		
		System.out.println("***익명 구현 객체로 출력***");
//		StringConcat concat2 = new StringConcat() {
//			@Override
//			public void makeString(String s1, String s2) {
//				System.out.println(s1 + " " + s2);
//			}
//		};
//		concat2.makeString("hello", "java");
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat2.makeString("hello", "java");
	}
}
