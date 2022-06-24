package windowsample;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameSample2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Program");
		frame.setSize(200, 80);
		frame.setLocation(300, 300);
		Container contentPane = frame.getContentPane();
		
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("Hello");
		
//		contentPane.add(text, BorderLayout.CENTER);
//		contentPane.add(button, BorderLayout.EAST);
//		contentPane.add(label, BorderLayout.SOUTH);
		
		contentPane.add(text, "Center");
		contentPane.add(button, "East");
		contentPane.add(label, "South");
		
//		ActionListener listener = new ConfirmBtnActionListener(text, label);
//		button.addActionListener(listener);
		
		ActionListener listener = new ActionListener() {
			@Override   //확인을 처리하는 익명 객체 
			public void actionPerformed(ActionEvent e) {
				String name = text.getText();
				label.setText("Hello, " + name);
			}
		};
		button.addActionListener(listener);	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
