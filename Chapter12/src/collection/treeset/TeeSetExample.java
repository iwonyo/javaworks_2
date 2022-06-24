package collection.treeset;

import java.util.TreeSet;

public class TeeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s : scores) {  //조회하면 오름차순 정렬됨
			System.out.println(s);
		}
		
		int score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score+"\n");
		
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : "+scores.size()+")");
		}
	}

}
