package collection.stackqueue;

class MyQueue{
	final static int MAX = 100;
	int[] queue;
	int size;
	int front = -1;
	int rear = -1;
	
	//큐 공간 메모리 생성
	public MyQueue(int size) {
		this.size = size;
		queue = new int[size];
	}
	
	//큐의 상태 - 비어 있음
	public boolean isEmpty() {
		if(front == rear)
			return true;
		else
			return false;
	}
	
	//큐의 상태 - 꽉 차 있음
	public boolean isFull() {
		int tmp = (rear + 1) % MAX;
		if(tmp == front)
			return true;
		else 
			return false;	
	}
	
	//큐에 데이터 추가
	public void addQueue(int value) {
		if(isFull())
			System.out.println("큐가 꽉 차 있습니다.");
		else {
			rear = (rear + 1) % MAX;
			queue[rear] = value;
		}
	}
	
	//큐에서 데이터 삭제
	public int delQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return 0;
		}
		else {
			front = (front + 1) % MAX;
			return queue[front];
		}		
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(3);
		queue.addQueue(10);
		queue.addQueue(20);
		queue.addQueue(30);
		
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
	}
}
