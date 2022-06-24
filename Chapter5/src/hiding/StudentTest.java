package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student();
		//lee.studentID = 1004
		//lee.studentName = "이강인";
		lee.setStudentID(1004);
		lee.setStudentName("이강인");
		
		System.out.println(lee.getStudentID());
		System.out.println(lee.getStudentName());
	}
}
