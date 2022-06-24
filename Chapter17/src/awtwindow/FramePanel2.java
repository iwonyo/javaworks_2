package awtwindow;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class FramePanel2 {

	public static void main(String[] args) {
		Frame frame =new Frame("텍스트필드 테스트"); 
		Panel panel = new Panel(); 
			
		TextField text1 = new TextField("아이디 입력",12); //텍스트필드생성
		TextField text2 = new TextField("암호 입력",10);
			
		text2.setEchoChar('*'); //문자가 *로 보임
			
		panel.add(text1);//패널에 텍스트필드 집어넣음
		panel.add(text2);
		frame.add(panel);
			
		frame.setSize(300,100); 
		frame.setVisible(true); 
	}
}
