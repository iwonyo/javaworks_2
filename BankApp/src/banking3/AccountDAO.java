package banking3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1522:xe";
	private static final String username="system";
	private static final String password="54321";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private Scanner scanner = new Scanner(System.in);
	
	//DB 접속
	public void connDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println("DB 연결 성공!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//접속 해제
	private void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//접속 해제(ResultSet 있는 경우)
	private void disconnectRS() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//계좌 생성
	public void createAccount() {
		System.out.println("---------------------------------");
	    System.out.println("1. 계좌 생성");
	    System.out.println("---------------------------------");
	    
	    //계좌번호(기본키) 중복 문제
	    System.out.println("계좌 번호 :");
	    String ano = scanner.next();
	    if(findAccount(ano) != null) {
	    	System.out.println("중복 계좌입니다. 다시 입력하세요");
	    	System.out.println("계좌 번호 :");
		    ano = scanner.next();
	    }
		    
	    System.out.println("계좌주 : ");
	    String owner = scanner.next();
	    
	    //초기 입금액 100원 이상 설정
	    System.out.println("초기 입금액 : ");
	    int balance = scanner.nextInt();
	    if(balance < 100) {
	    	System.out.println("기본 입금액은 100원 이상입니다. 다시 입력하세요");
	    	System.out.println("초기 입금액 : ");
		    balance = scanner.nextInt();
	    }
		
		connDB();
		String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.setString(2, owner);
			pstmt.setInt(3, balance);
			pstmt.executeUpdate();
			System.out.println("결과 : 계좌가 생성되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//계좌 목록
	public void accountList(){
		System.out.println("---------------------------------------");
	    System.out.println("2. 계좌 목록");
	    System.out.println("---------------------------------------");
	    
		ArrayList<Account> accountList = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			
			for(int i = 0; i < accountList.size(); i++) {
		    	Account account = accountList.get(i);
		    	System.out.print("계좌번호 : " + account.getAno() + "  ");
	    		System.out.print("계좌주 : " + account.getOwner() + "  ");
	    		System.out.println("잔액 : " + account.getBalance());
		    }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
	}
	
	//예금
	public void deposit() {
		System.out.println("---------------------------------");
	    System.out.println("3. 예  금");
	    System.out.println("---------------------------------");
	    
    	System.out.println("계좌 번호 :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
	    	System.out.println("계좌 번호 :");
		    ano = scanner.next();
	    }
    	System.out.println("입금액 :");
	    int money = scanner.nextInt();
	    
		Account account = findAccount(ano);  //입금할 계좌 가져옴
		String owner = account.getOwner();
		int balance = account.getBalance() + money;  //잔액 = 잔액 + 입금액
	
		connDB();
		String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.executeUpdate();
			System.out.println("결과 : 입금을 성공했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//출금
	public void withdraw() {
		System.out.println("---------------------------------");
	    System.out.println("4. 출  금");
	    System.out.println("---------------------------------");
	    
	    System.out.println("계좌 번호 :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
	    	System.out.println("계좌 번호 :");
		    ano = scanner.next();
	    }
	    
	    System.out.println("출금액 :");
	    int money = scanner.nextInt();
	    
	    Account account = findAccount(ano);
//	    ano = account.getAno();
	    String owner = account.getOwner();
		int balance = account.getBalance();
	    if(account.getBalance() < money) {
	    	System.out.println("잔액이 부족합니다. 다시 입력하세요");
	    	System.out.println("출금액 :");
		    money = scanner.nextInt();
	    }
	    balance = account.getBalance() - money;
	    
		connDB();
		String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.executeUpdate();
			System.out.println("결과 : 출금을 성공했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//특정 계좌 1개 검색
	public void searchAccount() {
		System.out.println("------------------------------------");
	    System.out.println("5.계좌 검색");
	    System.out.println("------------------------------------");
	    
    	System.out.println("계좌 번호 :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
	    	System.out.println("계좌 번호 :");
		    ano = scanner.next();
	    }
	    
	    Account account = findAccount(ano);
	    System.out.print("계좌번호 : " + account.getAno() + "  ");
		System.out.print("계좌주 : " + account.getOwner() + "  ");
		System.out.println("잔액 : " + account.getBalance());
	}
	
	//계좌 삭제
	public void deleteAccount() {
		System.out.println("-------------------------------");
	    System.out.println("6. 계좌 삭제");
	    System.out.println("-------------------------------");
	    
    	System.out.println("계좌 번호 :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
	    	System.out.println("계좌 번호 :");
		    ano = scanner.next();
	    }
	    
		connDB();
		String sql = "DELETE FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.executeUpdate();
			System.out.println("결과 : 계좌가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}		
	}
	
	//계좌 찾기 메서드(전체 메서드에서 사용됨)
	public Account findAccount(String ano) {
		Account account = null;
		connDB();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		return account;
	}
}











