package collection.stackqueue;

class Stack{
	int[] stack;
	int size;
	int top;
	
	//스택 메모리 공간 생성
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	//스택에 데이터 삽입
	public void Push(int n) {
		top++;
		stack[top] = n;
	}
	
	//스택에서 데이터 삭제
	public int Pop() {
		int n;
		if(top == -1) {
			System.out.println("스택이 비었습니다.");
			return 0;
		}	
		n = stack[top];
		top--;
		return n;
	}
		
}

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.Push(10);
		stack.Push(20);
		stack.Push(30);
		
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
	}
}
