package collection.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		Message mail = new Message("sendMail", "이순신");
		Message sms = new Message("sendSMS", "홍길동");
		Message katalk = new Message("sendKakaotalk", "류현진");
		
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(katalk);
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
