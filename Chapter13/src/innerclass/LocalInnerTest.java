package innerclass;

class Outer{
	int outNum = 100;    
	static int sNum = 200;
	
	Runnable getRunnable(int i){
		int num = 100;  
		
		class MyRunnable implements Runnable{
			int localNum = 10;  
			@Override
			public void run() {
				//num = 200;  내부클래스의 지역 변수는 상수로 바뀌므로 값을 변경할 수 없음 
				//i = 100;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);   //변경은 안되지만 참조는 할 수 있다.
			}
		}
		return new MyRunnable();	
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable(10).run();
		System.out.println("========");
		Runnable runner = outer.getRunnable(50);
		runner.run();
	}
}
