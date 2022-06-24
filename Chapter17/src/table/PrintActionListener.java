package table;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener implements ActionListener{
	JTable table;
	
	public PrintActionListener(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();  //모델을 가져옴
		int rowNum = model.getRowCount();     //모델로 부터 행과 열의 수 가져옴
		int colNum = model.getColumnCount();
		for(int col=0; col<colNum; col++) {
			String colName = model.getColumnName(col);  //칼럼 이름을 가져와 출력함
			System.out.print(colName + "\t");
		}
		System.out.println();
		for(int row=0; row<rowNum; row++) {      //데이터를 가져와서 출력함
			for(int col=0; col<colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
	}

}
