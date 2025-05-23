package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 부모 클래스의 매개변수로 들어가면서 upcasting
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
