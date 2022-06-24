package exercise;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		//익명(구현 클래스의 이름이 없는) 내부 클래스
		return new Runnable() {

			@Override
			public void run() {
				//num = 200;
				//i=20  //매개변수도 상수로 바뀜
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	//익명 내부 클래스를 인터페이스형 변수에 대입
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}


public class AnnoymousInnerClass {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		out.runner.run();
	}
}
