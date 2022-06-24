package combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exchange extends JFrame implements ActionListener{
	private static float USD_RATE = 1099.48F;
    private static float JPY_RATE = 10.64F;
    private static float EUR_RATE = 1347.69F;
    private static float CNY_RATE = 168.19F;
	
	String[] money = {"달러", "엔", "유로", "위안"};
	JComboBox<String> combo;
	JPanel pane1, pane2;
	JLabel lbl;
	JTextField txt;
	JButton btn;
	
	public Exchange() {
		combo = new JComboBox<>(money);
		Container con = getContentPane(); 
		
		setTitle("환율 계산하기");
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		lbl = new JLabel("변환 결과");
		txt = new JTextField(10);
		btn = new JButton("변환");
		
		con.add(pane1, "North");
		con.add(pane2, "Center");

		pane1.add(new JLabel("원화"));
		pane1.add(txt);
		pane1.add(combo);
		pane1.add(btn);
		
		pane2.add(lbl);
		
		setSize(350, 150);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculate();
	}
	
	private void calculate(){
		try {
			float won = Float.parseFloat(txt.getText());
			String result = null;
			String money = combo.getSelectedItem().toString();
			
			if(money.equals("달러")) {
				result = String.format("%.2f달러", won / USD_RATE);
			}else if(money.equals("엔")) {
				result = String.format("%.2f엔", won / JPY_RATE);
			}else if(money.equals("유로")) {
				result = String.format("%.2f유로", won / EUR_RATE);
			}else if(money.equals("위안")) {
				result = String.format("%.2f위안", won / CNY_RATE);
			}
			lbl.setText(result);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			new Exchange();
		}catch(Exception e) {
			System.out.println("문자를 입력하셨습니다.");
		}
	}
}
