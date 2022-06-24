package inheritance;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dmbPhone = new DmbCellPhone("자바폰","검정", 10);
		
		System.out.println("모델 : "+dmbPhone.model);
		System.out.println("색상 : "+dmbPhone.color);
		System.out.println("채널 : "+dmbPhone.channel);
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("여보세요");
		dmbPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbPhone.sendVoice("아~ 예 반갑습니다.");
		dmbPhone.hangUp();
		dmbPhone.turnOnDmb();
		dmbPhone.changeChannelDmb(12);
		dmbPhone.turnOffDmb();
	}

}
