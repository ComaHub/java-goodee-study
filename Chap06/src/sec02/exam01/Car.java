package sec02.exam01;

public class Car {
	// Field
	String company = "AUDI";
	String model = "A3";
	String color = "Black";
	int maxSpeed = 350;
	int currentSpeed;
	
	// class 내부에서의 field 사용
	// => field 이름으로 사용
	
	// Constructor
	public Car() {
//		currentSpeed = 30;
//		System.out.println(company);
	}
	
	// Method
	void printSpeed() {
		System.out.println(currentSpeed);
	}
}
