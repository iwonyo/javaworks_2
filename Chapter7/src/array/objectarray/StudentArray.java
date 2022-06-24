package array.objectarray;

public class StudentArray {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		
		student[0] = new Student(1001, "Ãß½Å¼ö");
		student[1] = new Student(1002, "¹ÚÀÎºñ");
		student[2] = new Student(1003, "¼ÕÈï¹Î");
		student[3] = new Student(1004, "·ùÇöÁø");
		student[4] = new Student(1005, "±è¿¬¾Æ");
		
		for(int i=0; i<student.length; i++) {
			student[i].showInfo();
		}
		
		for(Student stu : student)
			stu.showInfo();
	}

}
