package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		/* 변수를 사용하여 점수 저장 - 비효율적
		int std1KorScore = 0;
		int std1EngScore = 0;
		int std1MathScore = 0;
		
		int std2KorScore = 0;
		int std2EngScore = 0;
		int std2MathScoree = 0;*/
		
		//배열을 이용하여 점수 저장
		int[] korScore = new int[3];    //3명의 국어점수 배열
		korScore[0] = 90;
		korScore[1] = 80;
		korScore[2] = 70;
		
		//int korScore = {90, 80, 70};  //배열 생성시 초기화
		
		//배열의 크기(개수)
		System.out.println(korScore.length + "개");
		
		//1번 인덱스 값 조회
		System.out.println(korScore[1]);
		
		//전체 조회
		for(int i = 0; i < korScore.length; i++) {
			System.out.println(korScore[i]);
		}
	}
}
