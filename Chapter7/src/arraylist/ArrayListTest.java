package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add("ddd");  
		list.remove(1);  //삭제
		list.add(2, "kkk");  //특정 위치에 삽입
		System.out.println("-----");
		for(String s : list) {
			System.out.println(s);
		}

		ArrayList<Integer> numbers = new ArrayList<>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
		
		for(int i=0; i<numbers.size(); i++) {
			Integer num = numbers.get(i);
			System.out.println(num);
		}

	}

}
