package reference;

public class Point {
	int x;
	int y;
	
	void setX(int xx) { x = xx;}
	
	int getX() { return x; }
	
	void setY(int yy) {y = yy;}
	
	int getY() {return y;}
	
	public void showInfo() {
		System.out.println("Á¡(" + x + "," + y + ")");
	}
}
