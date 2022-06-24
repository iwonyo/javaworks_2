package cooperation;

public class Bus {
	int busNumber;
	int passenger;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passenger + 
				          "명이고, 수입은 " + money + "입니다.");
	}
	
}
