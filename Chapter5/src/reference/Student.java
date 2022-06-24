package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.setSubjectName(name);
	    korean.setScorePoint(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
	    math.setScorePoint(score);
	}
	
	public void showInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
