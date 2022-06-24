package reference2;

public class Student2 {
	String studentName;
	int studentID;
	/*
	Subject korean;
	Subject math;
	Subject science;
	*/
	public static Subject[] subjectArray;
	
	public Student2(String name, int id){
		studentName = name;
		studentID = id;
		subjectArray = new Subject[3];
		/*
		korean = new Subject("국어");
		math = new Subject("수학");
		science = new Subject("과학");
		*/
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name);
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		for(int i=0; i<subjectArray.length; i++) {
			subjectArray[i] = subject;
		}
	}
	
	/*
	public void setKorea(int score) {
		korean.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void setScience(int score) {
		science.setScore(score);
	}*/
	
	public void showInfo() {
		for(int i=0; i<subjectArray.length; i++) {
			Subject s = subjectArray[i];
			if(s !=null)
				System.out.println(studentName + " 학생의 "+ s.getSubjectName()+" 점수는 "+ s.getScorePoint());
		}
		
	}
	
}
