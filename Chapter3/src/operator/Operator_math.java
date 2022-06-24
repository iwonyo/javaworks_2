package operator;

public class Operator_math {

	public static void main(String[] args) {
		// 산술연산자
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);  //몫
		System.out.println(5%3);  //나머지
		
		// 과목의 총점과 평균 구하기
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2;
		System.out.println(avgScore);

	}

}
