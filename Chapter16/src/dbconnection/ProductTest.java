package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductTest {
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
			
			String query1 = "insert into Product values('p1003', 'sonata', 'white', 300)";
			System.out.println(query1);
			stmt.executeUpdate(query1);
			
			String query2 = "select * from Product order by prodCode";
			System.out.println(query2);
			
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				System.out.print("제품코드 : " + rs.getString("prodCode"));
				System.out.print(", 제품명 : " + rs.getString("prodName"));
				System.out.println(", 색상 : " + rs.getString("prodColor"));
				System.out.println(", 수량 : " + rs.getString("prodQty"));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
