package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1003,"김유신"));
		memberHashMap.addMember(new Member(1001,"이순신"));
		memberHashMap.addMember(new Member(1004,"신사임당"));
		memberHashMap.addMember(new Member(1002,"홍길동"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.addMember(new Member(1002,"장그래"));
		//memberHashMap.addMember(new Member(1005,"장그래"));
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
	
		memberHashMap.removeMember(1005);

	}

}
