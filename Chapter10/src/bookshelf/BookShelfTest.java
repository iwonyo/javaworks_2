package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();    //인터페이스 타입으로 객체 생성
		shelfQueue.enQueue("미생1");
		shelfQueue.enQueue("미생2");
		shelfQueue.enQueue("미생3");
		
		System.out.println("현재 리스트의 개수 " + shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
