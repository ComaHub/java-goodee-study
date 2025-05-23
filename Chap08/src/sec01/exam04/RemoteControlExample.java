package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl remoteControl;
		
		// remoteControl = new RemoteControl(); => 인터페이스는 인스턴스 생성 불가!
		
		// 인터페이스 변수에 해당 인터페이스를 구현한 클래스의 객체를 담을 수 있음
		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();
		
		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();
		
		// 메서드 호출 방법은 동일하지만, 어떤 구현 클래스 객체가 대입되었는지에 따라 실행 결과가 다름 (다형성)
	}
}
