package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member kang = new Member(1001, "강감찬");
		Member kim = new Member(1002, "김춘추");
		Member lee = new Member(1003, "이순신");  
		Member shin = new Member(1004, "신사임당");
		Member hong = new Member(1004, "홍길동");
			
		memberHashSet.addMember(kang);
		memberHashSet.addMember(kim);
		memberHashSet.addMember(lee);   
		memberHashSet.addMember(shin);
		memberHashSet.addMember(hong);
		
		memberHashSet.showAllMember();  //회원 전체조회(순서없고 중복 없이 출력)
		
		memberHashSet.removeMember(1003); //회원 삭제
		
		memberHashSet.showAllMember();
	}
}
