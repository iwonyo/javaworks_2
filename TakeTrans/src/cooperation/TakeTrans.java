package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Bus bus701 = new Bus(701);
		Subway line2 = new Subway(2);
		
		Student lee = new Student("이순신", 5000);
		lee.takeBus(bus701, 2000);
		lee.takeSubway(line2, 1500);
		
		Student hong = new Student("홍길동", 10000);
		hong.takeBus(bus701, 2000);
		hong.takeSubway(line2, 1500);
		
		lee.showInfo();
		hong.showInfo();
		bus701.showInfo();
		line2.showInfo();
		
		
	}
}
