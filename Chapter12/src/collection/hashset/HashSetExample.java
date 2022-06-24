package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("감");
		set.add("귤");
		set.add("사과");
		set.add("포도");
		set.add("사과");
		
		System.out.println("총 객체수:" + set.size());
		
		System.out.println(set);  //자료를 []로 감싸준다.
		
		//순회(조회)
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String fruit = ir.next();
			System.out.println(fruit);
		}
			
		set.remove("귤");
		set.remove("포도");
		
		System.out.println("총 객체수:" + set.size());
		System.out.println(set);
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
