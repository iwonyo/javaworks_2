package layout;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BorderLayoutSample2 extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JFrame frame;
	Container container;
	JLabel label0;
	JLabel label1;
	JTextField text;
	JButton button;
	
	public BorderLayoutSample2() {
		frame = new JFrame("Hello Program");
		container = getContentPane();
		label0 = new JLabel(" ");
		button = new JButton("»Æ¿Œ");
		label1 = new JLabel("Hello");
		
		getContentPane().add(label0, "North");
		
	}

	public static void main(String[] args) {
		new BorderLayoutSample2();
	}
}
