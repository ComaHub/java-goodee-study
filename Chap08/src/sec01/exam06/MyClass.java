package sec01.exam06;

public class MyClass {
	// 인터페이스 필드
	RemoteControl remoteControl = new Television();
	
	public MyClass() {}

	// 생성자의 인터페이스 매개변수
	public MyClass(RemoteControl remoteControl) {
		this.remoteControl = remoteControl;
		
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
	
	void methodA() {
		// 인터페이스 로컬 변수
		RemoteControl remoteControl = new Audio();
		
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
	
	// 메서드의 인터페이스 매개변수
	void methodB(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
}
