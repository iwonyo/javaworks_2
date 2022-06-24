package hiding;

class BirthDay{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month==2) {
			if(day<1 || day>28) {
				System.out.println("날짜 오류입니다.");
				this.day = day;
			}else if(day==29) {
				if((year%4==0 && year%100 !=0) || year%400==0) {
					System.out.println("윤년입니다.");
					this.day = day;
				}
			}
			else {
				this.day = day;
			}
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("날짜는 " + getYear() + "년 " + getMonth() + "월 " + getDay() + "일 ");
	}
	
}


public class BirthdayTest {

	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2020);
		day.setMonth(2);
		day.setDay(29);
		day.showInfo();
	}
}
