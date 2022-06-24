package ifExample;

public class LimitSpeed {

	public static void main(String[] args) {
		// 제한 속도
		int limitSpeed = 55;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!! 과태료 10만원 부과 대상");
		}else {
			System.out.println("안전 속도 준수!!");
		}
		System.out.println("시속 " + limitSpeed + "km입니다.");
	}
}
