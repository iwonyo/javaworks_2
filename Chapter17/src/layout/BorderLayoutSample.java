package layout;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BorderLayoutSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Program");
		Container contentPane = frame.getContentPane();
		
		JLabel label0 = new JLabel(" ");
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label1 = new JLabel("Hello");
		
		// 컨테이너에 컴포넌트 붙이기
//		contentPane.add(text, BorderLayout.CENTER);
//		contentPane.add(button, BorderLayout.EAST);
//		contentPane.add(label, BorderLayout.SOUTH);
		
		contentPane.add(label0, "North");
		contentPane.add(text, "Center");
		contentPane.add(button, "East");
		contentPane.add(label1, "South");

		//확인을 처리하는 익명 객체 
		ActionListener listener = new ActionListener() {
			@Override   
			public void actionPerformed(ActionEvent e) {
				String name = text.getText();
				label1.setText("Hello, " + name);
			}
		};
		button.addActionListener(listener);	
		
		frame.setSize(250, 100);
		frame.setLocation(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
