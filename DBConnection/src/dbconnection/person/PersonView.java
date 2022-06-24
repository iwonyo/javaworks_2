package dbconnection.person;

import java.util.ArrayList;

public class PersonView {

	public static void main(String[] args) {
		//PersonVO chu = new PersonVO("0001", "추신수", 35);
		//Person1VO inbi = new Person1VO("0002", "박인비", 32);
		PersonVO son = new PersonVO("0003", "손흥민", 28);
		PersonDAO dao = new PersonDAO();
		//dao.addPerson(chu);
		//dao.addPerson(inbi);
		dao.addPerson(son);

		ArrayList<PersonVO> list = dao.listAll();
		
		for(int i=0; i<list.size(); i++) {
			PersonVO data =list.get(i);
			String id = data.getId();
			String name = data.getName();
			int age = data.getAge();
			
			System.out.println("아이디:" + id + 
					           ", 이름:" + name +
					           ", 나이:" + age );
		}
	}

}
