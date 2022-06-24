package innerclass;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {  //이름 없는 내부클래스 생성

			@Override
			public void run() {
				System.out.println(num);
				System.out.println(i);
			}	
		};  //내부 클래스 끝에 ';' 
	}
		
	Runnable runner = new Runnable() {  //인터페이스형 변수 선언
		//세미콜론을 먼저 붙이면 run()을 implements 할 수 있다.
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");	
		}	
	};
}

public class AnnoymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerable = out.getRunnable(20);
		runnerable.run();
		out.runner.run();
	}
}
