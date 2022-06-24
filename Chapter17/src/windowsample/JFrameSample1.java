package windowsample;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JFrameSample1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java Program");  //프레임 생성
		frame.setLocation(500, 400);   //프레임의 위치
		frame.setSize(300, 200);       //프레임 크기
		
		JLabel label = new JLabel("Hello, 자바", SwingConstants.CENTER);  //라벨 생성
		
		Container contentPane = frame.getContentPane();  //패널 생성
		contentPane.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료 버튼
		frame.setVisible(true);	  //윈도우 디스플레이
	}
}
