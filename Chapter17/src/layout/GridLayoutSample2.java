package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutSample2 {

	public static void main(String[] args) {
		JFrame frm = new JFrame("연락처 프로그램");
		frm.setSize(250, 150);
		frm.setLocation(500, 400);
		Container contentPane = frm.getContentPane();
		
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(3, 2));
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		pane.add(new JLabel("이름"));
		pane.add(text1);
		pane.add(new JLabel("주소"));
		pane.add(text2);
		pane.add(new JLabel("전화번호"));
		pane.add(text3);
		contentPane.add(pane, "Center");
		contentPane.add(new JButton("입력"), "South");
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
