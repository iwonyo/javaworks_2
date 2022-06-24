package sec06.ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			/*
			 * for(int i=0; i<iaArr.length; i++) { System.out.println("네이버의 IP주소 : " +
			 * iaArr[i].getHostAddress()); }
			 */
			for(InetAddress remote : iaArr)
				System.out.println("네이버의 IP 주소 : " + remote.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
