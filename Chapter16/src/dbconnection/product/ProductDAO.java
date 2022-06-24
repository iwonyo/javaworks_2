package dbconnection.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String user="scott";
	private static final String pwd="tiger";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addProduct(ProductVO productVO) {
		String code = null;
		String name = null;
		String color = null;
		int qty = 0;
		
		code = productVO.getProdCode();
		name = productVO.getProdName();
		color = productVO.getProdColor();
		qty = productVO.getProdQty();
		
		try {
			connDB();
			String query = "INSERT INTO Product(prodCode, prodName, prodColor, prodQty) "
				+ "VALUES ('" + code + "', '" + name + "', '" + color + "'," + qty + ")";
			System.out.println(query);
			stmt.executeUpdate(query);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ProductVO> listAll(){
		ArrayList<ProductVO> list = new ArrayList<>();
		try {
			connDB();
			String query = "SELECT * FROM Product ORDER BY prodCode";
			System.out.println(query);
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String code = rs.getString("prodCode");
				String name = rs.getString("prodName");
				String color = rs.getString("prodColor");
				int qty = rs.getInt("prodQty");
				
				ProductVO data = new ProductVO(code, name, color, qty);			
				list.add(data);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
