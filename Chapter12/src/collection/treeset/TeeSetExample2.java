package collection.treeset;

import java.util.TreeSet;

public class TeeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("홍길동");
		names.add("강감찬");
		names.add("손흥민");
		names.add("장그래");
		names.add("강감찬");
		
		for(String str : names) {
			System.out.println(str);
		}
	}
}
