package awtwindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderSample1 {
	private Frame frame;
	private Button center, east, west, south;
	private TextField text;
	
	public BorderSample1() {
		frame = new Frame("BorderLayout 예제");
		south = new Button("버튼1");  //버튼 생성
		west = new Button("버튼2");
		east = new Button("버튼3");
		center = new Button("버튼4");
	
		text = new TextField();
		text.setText("입력창입니다.");
	}
	
	public void startFrame() {
		frame.add(text, "North");
		frame.add(east, "East");
		frame.add(west, "West");
		frame.add(south, "South");
		frame.add(center, "Center");
		
		frame.setSize(400, 500);  //프레임 크기
		frame.setVisible(true);   //화면 보이기
	}

	public static void main(String[] args) {
		BorderSample1 border = new BorderSample1();
		border.startFrame();	
	}
}
