package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberTest {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String user="scott";
	private static final String pwd="tiger";

	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url,user, pwd);
			System.out.println("Connection 생성 성공");
			
			stmt = conn.createStatement();
			System.out.println("Statement 객체 생성 성공");
			
			String query1 = "insert into Member values('0003', '류현진', 180, 70, 33)";
			System.out.println(query1);
			stmt.executeUpdate(query1);
			
			String query2 = "select * from Member";
			System.out.println(query2);
			
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				System.out.print("아이디 : " + rs.getString("id"));
				System.out.print("이름 : " + rs.getString("name"));
				System.out.print("키 : " + rs.getInt("height"));
				System.out.print("체중 : " + rs.getInt("weight"));
				System.out.println("나이 : " + rs.getInt("age"));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
