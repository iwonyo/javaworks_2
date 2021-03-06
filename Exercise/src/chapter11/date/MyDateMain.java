package chapter11.date;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.day==date.day && this.month==date.month && this.year==date.year)
				return true;
			else
				return false;
		}
		return false;
	}
	
}

public class MyDateMain {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(7, 12, 2019);
		MyDate date2 = new MyDate(7, 12, 2019);
		System.out.println(date1.equals(date2));
	}

}
