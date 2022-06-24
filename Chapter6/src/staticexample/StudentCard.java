package staticexample;

public class StudentCard {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int cardNumber;
	
	public StudentCard() {
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}
}
