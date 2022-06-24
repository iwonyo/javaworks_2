package reference;

public class Circle {
	Point point;
	int radius;
	
	public Circle(int r) {
		point = new Point();
		radius = r;
	}
	
	public void setPoint(int x, int y) {
		point.setX(x);
		point.setY(y);
	}
	
	public void showInfo() {
		System.out.println("원의 중심(" + point.getX()+","+ point.getY() + ")"
	                      + ", 원의 반지름 : " + radius );
	}
}
