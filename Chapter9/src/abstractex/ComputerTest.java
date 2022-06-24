package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();   //인스턴스를 생성할 수 없다.
		Computer c2 = new DeskTop();      //형 변환
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
	}
}
