package cooperation;

public class Subway {
	int lineNumber;
	int passenger;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선 승객은 " + passenger 
				        + "명이고, 수입은" + money + "입니다.");
	}
	
}
