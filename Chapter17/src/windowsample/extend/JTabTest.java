package windowsample.extend;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTabTest extends JFrame{
	JPanel pane1, pane2;
	ImageIcon icon;
	JLabel lbl;
	JTabbedPane tabPane;
	JTextField text;
	JTextArea textArea;
	
	public JTabTest() {
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		icon = new  ImageIcon("dogs.jpg");
		lbl = new JLabel(icon);   //그림을 담는 라벨
		
		text = new JTextField("테스트입니다.");
		pane1.add(text);
		
		textArea = new JTextArea(7, 20);  //7행. 20자
		textArea.setText("내용을 입력하세요. ");
		
		tabPane = new JTabbedPane();
		tabPane.addTab("탭1", lbl);
		tabPane.addTab("탭2", textArea);
		
		getContentPane().add(tabPane);   //Container의 contentPane
		setBounds(0, 0, 500, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTabTest();
	}
}
