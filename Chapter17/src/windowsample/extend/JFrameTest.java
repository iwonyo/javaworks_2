package windowsample.extend;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		JButton btn1 = new JButton("추가");
		JTextField text1 = new JTextField("JFrame 테스트");
		JButton btn2 = new JButton("삭제");
		
		Container contentPane = getContentPane();
		contentPane.add(text1, "North");
		contentPane.add(btn1, "Center");
		contentPane.add(btn2, "South");
		
		setSize(200, 300);
		setLocation(300, 200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest();
	}
}
