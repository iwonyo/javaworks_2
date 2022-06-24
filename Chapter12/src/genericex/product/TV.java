package genericex.product;

public class TV {

	public void making() {
		System.out.println("회사가 TV를 제조합니다.");
	}
	
	@Override
	public String toString() {
		return "제품은 스마트 TV입니다.";
	}
}
