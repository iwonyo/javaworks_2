package staticexample;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.studentName+", "+studentSon.studentID);
		//System.out.println(Student2.getSerialNum());
		
		Student2 ryu = new Student2();
		ryu.setStudentName("·ùÇöÁø");
		System.out.println(ryu.studentName + ", " + ryu.studentID);
		//System.out.println(Student2.getSerialNum());
		
	}
}
