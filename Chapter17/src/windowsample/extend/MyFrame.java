package windowsample.extend;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("Hello Java Window");
		setSize(300, 150);
		setLocation(200, 300);
		
		JLabel label = new JLabel();
		label.setText("Hello~ Java!!");
		
		Container contentPane = getContentPane();
		contentPane.add(label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
