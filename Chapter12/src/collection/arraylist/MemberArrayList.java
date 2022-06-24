package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	//Member형으로 선언한 ArrayList 생성
	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
	}
	
	//ArrayList에 회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ArrayList에서 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId();
			if(dbMemberId==memberId) {
				arrayList.remove(i);
				return true;
			}else {
				return false;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
//		Iterator<Member> ir = arrayList.iterator();
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			if(member.getMemberId()==memberId) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		

	
	public void insertMember(Member member, int index) {
//		if(index< 0 || index > arrayList.size()+1)
//			System.out.println("지정된 위치에 추가할수 없습니다.");
//		arrayList.add(index-1, member);
		try {
			arrayList.add(index-1, member);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("지정된 자리에 추가할 수 없습니다.");
		}
	}
}
