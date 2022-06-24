package streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		//collection에서 스트림 활용하기
		List<String> sList = new ArrayList<>();
		sList.add("cat");
		sList.add("elephant");
		sList.add("deer");
		
		for(String str : sList) {
			System.out.println(str);
		}
		
		//Stream 클래스
		Stream<String> stream = sList.stream();
		stream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		sList.stream().forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		//중간연산 -> 오름차순 정렬
		sList.stream().sorted().forEach(str -> System.out.println(str));
		System.out.println();
		
		//중간연산 -> 문자의 길이
		sList.stream().filter(s->s.length()>=5).forEach(str -> System.out.println(str));
	}
}
