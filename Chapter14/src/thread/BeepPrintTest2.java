package thread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();   //인터페이스형으로 beepTask 객체 생성
		Thread thread = new Thread(beepTask);   //Thread 인스턴스 생성
		thread.start();      //쓰레드 시작
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
