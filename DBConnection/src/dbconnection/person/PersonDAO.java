package dbconnection.person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String user="scott";
	private static final String password="tiger";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void addPerson(PersonVO personVO) {
		String id = null;
		String name = null;
		int age = 0;
		
		id = personVO.getId();
		name = personVO.getName();
		age = personVO.getAge();
		
		try {
			connDB();
			String query = "INSERT INTO Person1(id, name, age) VALUES ('" + id + "','" + 
			                                                               name + "'," + 
					                                                       age + ")";
			System.out.println(query);
			stmt.executeUpdate(query);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<PersonVO> listAll(){
		ArrayList<PersonVO> list = new ArrayList<>();
		try {
			connDB();
			String query = "SELECT * FROM Person1 ORDER BY id";
			System.out.println(query);
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				PersonVO data = new PersonVO(id, name, age);			
				list.add(data);
			}
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 생성 성공");
			
			stmt = con.createStatement();
			System.out.println("Statement 생성 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
