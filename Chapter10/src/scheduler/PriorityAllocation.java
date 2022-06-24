package scheduler;

public class PriorityAllocation implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
}
