package awtwindow;

import java.awt.Frame;

public class FrameSample1 {

	public static void main(String[] args) {
		Frame frame = new Frame();  //프레임생성
		frame.setTitle("첫번째 윈도우");
		
		frame.setSize(300, 300);  //프레임 크기
		frame.setVisible(true);   //화면 보이기
	}
}
