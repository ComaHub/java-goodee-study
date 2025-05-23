package sec01.exam01;

// parent class: 일반적인 공통 특성을 작성
public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		System.out.println("CellPhone() 호출됨");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
