package innerclass;

class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public class Score{
		int eng;
		int math;
		
		public void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("영어 점수: " + eng);
			System.out.println("수학 점수: " + math);
		}
	}
}

public class StudentInnerClass {
	public static void main(String[] args) {
		Student jang = new Student("장그래");
		Student.Score score = jang.new Score();
		score.eng = 88;
		score.math = 73;
		score.showInfo();
	}
}
