package exercise;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 100;
		
		//지역 내부 클래스
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200; //지역변수는 상수로 바뀌므로 값을 변경할수 없음(final 예약어가 생략되어 있음)
				//getRunnable()이 호출된 후 run()메서드가 실행. num을 참조하는 것은 상수이므로 가능.
				localNum = 20;
				System.out.println(num);     //num변수는 변경은 안되지만 사용은 가능.
				System.out.println(localNum);
				System.out.println(outNum + "(외부클래스 인스턴스 변수)");
				System.out.println(Outer.sNum + "(외부클래스 정적 변수)");
			}
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.getRunnable().run();
		
		System.out.println("***Runnable 인터페이스형 변수 runner에 대입 ***");
		Runnable runner = out.getRunnable();
		runner.run();

	}

}
