package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus, int money) {
		bus.take(money);
		this.money -= money;
	}
	
	public void takeSubway(Subway subway, int money) {
		subway.take(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
