package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

// Queue를 이용한 간단한 메시지 큐를 구현
// 먼저 넣은 메시지가 반대쪽에서 먼저 나옴 (FIFO)
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "정유니"));
		messageQueue.offer(new Message("sendSMS", "정히나"));
		messageQueue.offer(new Message("sendKakaotalk", "정리코"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail" -> System.out.println(message.to + "님에게 메일을 보냅니다.");
				case "sendSMS" -> System.out.println(message.to + "님에게 SMS를 보냅니다.");
				case "sendKakaotalk" -> System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				default -> {}
			}
		}
	}
}
