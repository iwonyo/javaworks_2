package staticexample;

public class StudentCardTest {

	public static void main(String[] args) {
		StudentCard Jang = new StudentCard();
		Jang.setStudentName("장그래");
		System.out.println("학번: " + Jang.studentID + ", 이름: " + Jang.getStudentName() + 
				           ", 카드번호: " + Jang.cardNumber);
		
		StudentCard Park = new StudentCard();
		Park.setStudentName("박인비");
		System.out.println("학번: " + Park.studentID + ", 이름: " + Park.getStudentName() + 
				           ", 카드번호: " + Park.cardNumber);

		StudentCard Chu = new StudentCard();
		Chu.setStudentName("박인비");
		System.out.println("학번: " + Chu.studentID + ", 이름: " + Chu.getStudentName() + 
				           ", 카드번호: " + Chu.cardNumber);
	}
}
