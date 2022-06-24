package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList <String> myList = new LinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("K"); //연결리스트의 맨 앞에 K추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast());  //맨 뒤 요소 삭제
		System.out.println(myList);
	}
}
