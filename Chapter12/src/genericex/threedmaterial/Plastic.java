package genericex.threedmaterial;

public class Plastic extends Material{
	
	@Override
	public void doPrinting() {
		System.out.println("3D 프린터로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 plastic 입니다.";
	}
}
