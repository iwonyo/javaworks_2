package bookshelf;

public interface Queue {
	void enQueue(String title); //맨뒤로 들어감
	String deQueue();  //맨 앞에서 꺼냄
	int getSize();
}
