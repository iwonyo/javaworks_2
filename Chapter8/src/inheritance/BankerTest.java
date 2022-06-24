package inheritance;

class People{
	String name;
	String rrn;  //주민등록번호(Resident Registration Number)
	
	public People(String name, String rrn) {
		this.name = name;
		this.rrn = rrn;
	}
}

class Banker extends People {
	int companyID;
	
	public Banker(String name, String rrn, int companyID) {
		super(name, rrn);
		this.companyID = companyID;
	}
}

public class BankerTest {

	public static void main(String[] args) {
		Banker BankerJang = new Banker("장그래", "920815-1234567", 101);
		System.out.println("이름 : " + BankerJang.name);
		System.out.println("주민등록번호 : " + BankerJang.rrn);
		System.out.println("사번 : " + BankerJang.companyID);
	}
}
