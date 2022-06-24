/*
 * 학번 자동 발급 프로그램
 */

package staticexample;

public class Student2 {
	private static int serialNum = 1000; //static 변수
	int studentID;    //인스턴스 변수                
	String studentName;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		//studentID = 1002;  인스턴스 변수를 사용할 수 없다.
		Student2.serialNum = serialNum;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
