package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentID = 1001;
		studentLee.studentName = "이순신";
		
		System.out.println("학번 : " + studentLee.studentID);
		System.out.println("이름 : " + studentLee.studentName);
		
		System.out.println(studentLee);
	}
}
