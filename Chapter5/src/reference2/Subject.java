package reference2;

public class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject(String name) {
		subjectName = name;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int score) {
		this.scorePoint = score;
	}
	
}
