package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(201901, "이순신");
		studentLee.setKorean("국어", 100);
		studentLee.setMath("수학", 90);
		Student studentSin = new Student(201902, "신사임당");
		studentSin.setKorean("국어", 95);
		studentSin.setMath("수학", 85);
		
		studentLee.showInfo();
		studentSin.showInfo();
	}
}
