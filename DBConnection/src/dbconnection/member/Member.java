package dbconnection.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Member extends JFrame{
	JLabel lbl1, lbl2, lbl3, lbl4;
	JTextField txt1, txt2, txt3, txt4;
	JButton save, cancel;
	
	public Member() {
		lbl1 = new JLabel("아이디");
		lbl2 = new JLabel("패스워드");
		lbl3 = new JLabel("이름");
		lbl4 = new JLabel("나이");
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		txt4 = new JTextField();
		save = new JButton("저장");
		cancel = new JButton("취소");
		
		JPanel pane = new JPanel();
		pane.setLayout(null);
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		add(lbl3);
		add(txt3);
		add(lbl4);
		add(txt4);
		add(save);
		add(cancel);
		
		lbl1.setBounds(60, 50, 60, 40);
		txt1.setBounds(130, 50, 120, 40);
		lbl2.setBounds(60, 100, 60, 40);
		txt2.setBounds(130, 100, 120, 40);
		lbl3.setBounds(60, 150, 60, 40);
		txt3.setBounds(130, 150, 120, 40);
		lbl4.setBounds(60, 200, 60, 40);
		txt4.setBounds(130, 200, 120, 40);
		save.setBounds(70, 270, 80, 40);
		cancel.setBounds(160, 270, 80, 40);
		
		add(pane);
		setTitle("회원가입 화면");
		setLocation(600, 300);
		setSize(350, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberVO vo = new MemberVO(txt1.getText(), txt2.getText(), txt3.getText(), Integer.parseInt(txt4.getText()));
				MemberDAO dao = new MemberDAO();
				
				dao.addMember(vo);
				JOptionPane.showMessageDialog(null, "회원가입을 축하합니다.");
				dispose();
			}
			
		});
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
