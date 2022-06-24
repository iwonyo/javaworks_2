package ifExample;

public class Seat {

	public static void main(String[] args) {
		//좌석 줄 수 계산
		//입장객 수, 좌석 열의 개수
		int customer = 22;
		int column = 5;
		int row = 0;
		
		//row = customer / column;
		
		//나머지가 있는 경우와 나누어 떨어지는 경우 발생
		//나머지가 있으면 1줄 추가해야 함.
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = customer / column + 1;   //rValue에서 형변환 발생
		}
		System.out.println(row + "개의 줄이 필요합니다.");
	}
}
