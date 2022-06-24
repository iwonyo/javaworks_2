package staticexample;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		System.out.println(Student.serialNum);
		System.out.println(studentLee.studentID);
		
		Student studentPark = new Student();
		System.out.println(Student.serialNum);
		System.out.println(studentPark.studentID);
	
	}
}
