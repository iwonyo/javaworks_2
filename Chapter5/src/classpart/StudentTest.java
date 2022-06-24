package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.studentID = 1001;
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 노원구 상계동";
		
		studentLee.showInfo();
		System.out.println(studentLee);
	}
}
