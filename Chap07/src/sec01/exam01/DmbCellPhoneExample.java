package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("iPhone", "Black", 10);
		
		// 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		// 자식 클래스의 고유 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// 상속받은 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("누구세요?");
		dmbCellPhone.receiveVoice("안녕하세요! 집게사장님 맞으신가요?");
		dmbCellPhone.sendVoice("아뇨 전 뚱인데요?");
		dmbCellPhone.hangUp();
		
		// 자식 클래스 고유 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChennelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
