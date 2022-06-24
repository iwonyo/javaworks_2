package chapter12.q5;

public class Student {
	String studentID;
	String studentName;
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentID + ":" + studentName;
	}

//	@Override
//	public int hashCode() {
//		return Integer.parseInt(studentID);
//	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentID==student.studentID)
				return true;
			else
				return false;
		}
		return false;
	} 
}
