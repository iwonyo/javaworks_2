package dbconnection.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class User extends JFrame{
	JLabel lbl1, lbl2;
	JTextField txt1, txt2;
	JButton join, login;
	
	public User() {
		lbl1 = new JLabel("아이디");
		lbl2 = new JLabel("패스워드");
		txt1 = new JTextField();
		txt2 = new JTextField();
		join = new JButton("회원가입");
		login = new JButton("로그인");
		
		JPanel pane = new JPanel();
		pane.setLayout(null);
		add(lbl1);
		add(txt1);
		add(join);
		add(lbl2);
		add(txt2);
		add(login);
		
		lbl1.setBounds(40, 50, 50, 40);
		txt1.setBounds(100, 50, 100, 40);
		join.setBounds(220, 50, 100, 40);
		lbl2.setBounds(40, 120, 60, 40);
		txt2.setBounds(100, 120, 100, 40);
		login.setBounds(220, 120, 100, 40);
		
		add(pane);
		setTitle("로그인 화면");
		setLocation(500, 200);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
			}
		});
		
	}

}
