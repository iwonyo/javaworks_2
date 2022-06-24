package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("이순신", 85);
		map.put("강감찬", 80);
		map.put("신사임당", 90);
		map.put("이순신", 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		//객체 찾기
		System.out.println("이순신 : " + map.get("이순신"));
		System.out.println();
		
		//객체를 하나씩 처리
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIr = keySet.iterator();
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + ", " + value);
		}
		
		//객체 삭제
		map.remove("강감찬");
		System.out.println("총 Entry 수 : " + map.size());
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
