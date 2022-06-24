package object;

class Student{
	int studentId;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentId = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {	
		Student studentLee = new Student(100, "이강인");
		Student studentLee2 = studentLee;
		Student studentKang = new Student(100, "이강인");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2은 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2은 동일하지 않습니다.");
		
		if(studentLee == studentKang)
			System.out.println("studentLee와 studentKang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentKang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentKang))
			System.out.println("studentLee와 studentKang은 동일합니다.");
		else
			System.out.println("studentLee와 studentKang은 동일하지 않습니다.");
		
		System.out.println("****hash()코드 테스트******");
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
		System.out.println("studentKang의 hashCode: " + studentKang.hashCode());
	}
}
