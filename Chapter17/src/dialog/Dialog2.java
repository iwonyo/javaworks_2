package dialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dialog2 extends JDialog{
	JTextField txt = new JTextField(10);  //10ÀÚ
	JButton okBtn = new JButton("OK");
	
	public Dialog2(JFrame frm, JLabel lbl, String title) {
		super(frm, title);
		setLayout(new FlowLayout());
		getContentPane().add(txt);
		getContentPane().add(okBtn);
		
		this.setLocation(200, 200);
		setSize(200, 200);
		setModal(true);
		setVisible(true);
		
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = txt.getText();
				lbl.setText(text);
				dispose();   //ÀÚ½ÅÀ» ¼û±è
			}
		});
	}
	
}
