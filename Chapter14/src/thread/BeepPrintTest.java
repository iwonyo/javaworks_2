package thread;

import java.awt.Toolkit;

public class BeepPrintTest {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
