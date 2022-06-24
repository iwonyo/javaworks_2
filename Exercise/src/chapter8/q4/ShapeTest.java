package chapter8.q4;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		sTest.drawShape(new Circle());
		sTest.drawShape(new Triangle());
	}
	
	public void drawShape(Shape shape) {
		shape.draw();
	}
}
