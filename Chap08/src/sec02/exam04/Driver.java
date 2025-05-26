package sec02.exam04;

public class Driver {
	// 매개변수로 다양한 구현 클래스 객체가 들어올 수 있음
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
