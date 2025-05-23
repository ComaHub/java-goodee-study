package sec02.exam03;

public class Car {
	Tire frontLeftTire = new Tire("Front-Left", 6);
	Tire frontRightTire = new Tire("Front-Right", 2);
	Tire backLeftTire = new Tire("Back-Left", 6);
	Tire backRightTire = new Tire("Back-Right", 4);
	
	// 타이어 4개를 모두 1회전 시키는 메서드
	// 펑크난 타이어를 정수값으로 리턴
	int run() {
		System.out.println("자동차가 달립니다.");
		
		// 어떤 객체를 참조하는지에 따라 실행 결과가 달라짐 => 다형성
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
