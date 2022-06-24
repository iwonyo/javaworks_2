package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 53);
		studentLee.addSubject("과학", 80);
		
		Student studentPark = new Student(1002, "Park");
		studentPark.addSubject("국어", 88);
		studentPark.addSubject("수학", 70);
		studentPark.addSubject("영어", 93);
		
		studentLee.showStudentInfo();
		System.out.println("===============================================");
		studentPark.showStudentInfo();	
	}
}
