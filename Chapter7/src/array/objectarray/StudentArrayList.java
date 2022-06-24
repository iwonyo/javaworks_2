package array.objectarray;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<>();
		Student chu = new Student(2020001, "Ãß½Å¼ö");
		Student inbi = new Student(2020002, "¹ÚÀÎºñ");
		Student son = new Student(2020003, "¼ÕÈï¹Î");
		
		studentlist.add(chu);
		studentlist.add(inbi);
		studentlist.add(son);
		
//		students.add(new Student(2020001, "Ãß½Å¼ö"));
//		students.add(new Student(2020002, "¹ÚÀÎºñ"));
//		students.add(new Student(2020003, "¼ÕÈï¹Î"));
		
		for(int i=0; i<studentlist.size(); i++) {
			Student stu = studentlist.get(i);
			stu.showInfo();
		}
		
		System.out.println();
		
		for(Student stu : studentlist)
			stu.showInfo();

	}

}
