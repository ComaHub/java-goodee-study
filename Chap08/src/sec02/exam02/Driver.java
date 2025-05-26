package sec02.exam02;

public class Driver {
	// 매개변수로 Vehicle Interface를 구현한 여러 객체가 올 수 있음
	public void drive(Vehicle vehicle) {
		vehicle.run(); // 구현 클래스 객체의 overriding된 run()이 호출됨
		// 객체가 바뀌어도 사용법은 바뀌지 않는다 (장점!)
	}
}
