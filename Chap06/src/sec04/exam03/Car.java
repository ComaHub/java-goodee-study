package sec04.exam03;

public class Car {
	// Field
	int gas;
	
	// Constructor
	// 기본 생성자 사용
	
	// Method
	// 연료를 주입하는 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 연료를 확인하는 메소드
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		
		// if의 조건식이 false일 때 이 코드에 도달할 수 있음
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	// 달리는 메소드
	void run() {
		while (true) {
			if (gas <= 0) {
				System.out.println("멈춥니다.");
				return;
			}
			
			System.out.println("달립니다. (가스 잔량: " + gas-- + ")");
		}
	}
}
