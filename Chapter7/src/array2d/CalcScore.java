package array2d;

public class CalcScore {

	public static void main(String[] args) {
		//학생 5명의 국어, 수학 점수 합계 
		int[][] score = {
				{91, 70},
				{80, 50},
				{76, 60},
				{90, 49},
				{80, 80}
		}; 
		int[] total  = {0, 0};
		double[] avg = {0.0, 0.0};
		int i, j;
		
		//데이터 출력(조회)
		for(i=0; i<score.length; i++) {
			for(j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		//계산
		for(i=0; i<score.length; i++) {
			total[0] += score[i][0];
			total[1] += score[i][1];
		}
		avg[0] = (double)total[0] / score.length;
		avg[1] = (double)total[1] / score.length;
		
		System.out.println("국어 점수 합계 : " + total[0]);
		System.out.println("국어 점수 평균 : " + avg[0]);
		System.out.println("수학 점수 합계 : " + total[1]);
		System.out.println("수학 점수 평균 : " + avg[1]);

	}

}
