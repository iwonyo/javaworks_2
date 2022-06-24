package table;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTableTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단");
		frame.setSize(350, 150);
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		String colName[] = {"이름", "나이", "성별"};   //칼럼 이름 -일차원 배열
		Object data[][] = { {"장그래", 24, "남"},     //데이터 - 이차원 배열
				            {"안영이", 26, "여"},
				            {"김대리", 33, "남"}};
		
		JTable table = new JTable(data, colName);  //테이블 생성
		
		JScrollPane scrollPane = new JScrollPane(table);  //표를 담는 패널
		contentPane.add(scrollPane, "Center");
		
		JButton btn = new JButton("출력");
		contentPane.add(btn, "South");
		
		//PrintActionListner 객체 생성
		ActionListener listener = new PrintActionListener(table);
		btn.addActionListener(listener);
		
		//익명 객체 구현
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableModel model = table.getModel();
				int rowNum = model.getRowCount();    //모델로 부터 행과 열의 수를 가져오기
				int colNum = model.getColumnCount();
				
				for(int col=0; col < colNum; col++) {  //칼럼 이름 출력
					String colName = model.getColumnName(col);
					System.out.print(colName + "\t");
				}
				System.out.println();
				
				for(int row=0; row < rowNum; row++) {
					for(int col=0; col < colNum; col++) {
						Object obj = model.getValueAt(row, col);
						System.out.print(obj + "\t");
					}
					System.out.println();
				}
			}
		};
		btn.addActionListener(listener2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
