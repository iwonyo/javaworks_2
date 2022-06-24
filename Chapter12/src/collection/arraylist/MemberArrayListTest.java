package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberList = new MemberArrayList();
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1003, "김유신");
		Member memberKang = new Member(1002, "강감찬");
		Member memberShin = new Member(1004, "신사임당");
		
		memberList.addMember(memberLee);
		memberList.addMember(memberKim);
		memberList.addMember(memberKang);
		memberList.addMember(memberShin);
	    
		memberList.showAllMember();
	    
		memberList.removeMember(1002);  //1003 회원 삭제
		memberList.showAllMember();  //전체 회원 출력
	    
//	    Member memberHong = new Member(1005, "홍길동");
//	    memberList.insertMember(memberHong, 6);  //2번째 위치에 회원 추가
//	    memberList.showAllMember(); 
	}
}
