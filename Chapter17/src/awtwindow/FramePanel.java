package awtwindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class FramePanel {

	public static void main(String[] args) {
		Frame frame = new Frame("버튼테스트"); 
		Panel panel = new Panel(); //패널생성
			
		Button btn1 = new Button(); //버튼생성
		Button btn2 = new Button("출력");

		btn1.setLabel("입력");//버튼1에 이름설정
		panel.add(btn1); //패널에 버튼붙이기
		panel.add(btn2);
		frame.add(panel); //프레임에에 패널붙이기
			
		frame.setLocation(300,300); //프레임위치
		frame.setSize(300,100);
		frame.setVisible(true);
	}
}
