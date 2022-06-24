package object;

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x+ "," + "y=" + y;
	}
}

class Circle implements Cloneable{ //객체를 복제해도 된다는 의미의 Cloneable 인터페이스 구현
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		System.out.println(circle);
		
		Circle circle2 = (Circle) circle.clone();  //강제 형변환
		System.out.println(circle2);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circle2));
	}

}
