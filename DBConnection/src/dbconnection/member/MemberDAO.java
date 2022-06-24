package dbconnection.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbconnection.person.PersonVO;

public class MemberDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String user="scott";
	private static final String password="tiger";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
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
	
	//회원 삽입
	public void addMember(MemberVO memberVO) {
		String id = null;
		String name = null;
		int age = 0;
		String password = null;
		
		id = memberVO.getId();
		name = memberVO.getName();
		age = memberVO.getAge();
		password = memberVO.getPassword();
		
		try {
			connDB();
			String query = "INSERT INTO Member(id, name, age, password) "
					       + "VALUES ('" + id + "','" + 
			                               name + "'," + 
					                       age + ",'" + 
			                               password + "')";
			System.out.println(query);
			stmt.executeUpdate(query);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//회원 삭제
	public void delMember(MemberVO vo) {
		String _name = null;
		_name = vo.getName();
		
		connDB();
		String query = "DELETE FROM Member ";
		query += "WHERE name = '" + _name + "'";
		System.out.println(query);
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	//회원 수정
	public void modMember(MemberVO vo) {
		String _name = null;
		int _age = 0;
		
		_name = vo.getName();
		_age = vo.getAge();
		
		connDB();
		String query = "UPDATE Member ";
		query += " SET age =" + _age;
		query += " WHERE name = '" + _name + "'";
		System.out.println(query);
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 조회
	public ArrayList<MemberVO> listAll(){
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			connDB();
			String query = "select * from Member order by id";
			System.out.println(query);
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String password = rs.getString("password");
				
				MemberVO data = new MemberVO(id, password, name, age);
				
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
	
}
