package sec01.exam05;

public class SmartTelevitionExample {
	public static void main(String[] args) {
		SmartTelevision smartTv = new SmartTelevision();
		
		// 하나의 객체로 두 인터페이스 사용
		RemoteControl remoteControl = smartTv;
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();
		// RemoteCoutrol에서 명시한 기능만 사용 가능
		
		Searchable searchable = smartTv;
		searchable.search("www.google.com");
		// 어떤 인터페이스 변수에 대입할지 결정하는 기준 => "어떤 기능만을 사용할 것인가?" 메서드의 범위에 맞게 선택
	}
}
