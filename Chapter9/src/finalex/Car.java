package finalex;

public final class Car {
	public int speed;
	String name;
	
    public void speedUp() {
    	speed += 1;
    }
	
    public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
    }
}
