package object.alone;

class Student{
	String studentName;
	int studentID;
	
	Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return studentName + ", " + studentID;
	}	
}

public class StudentTest {
	public static void main(String[] args) {
		Student studentJang = new Student("Àå±×·¡", 201901);
		System.out.println(studentJang);
		System.out.println(studentJang.toString());

	}
}
