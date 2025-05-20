package sec03.exam03;

public class Car {
	// Field
	String company = "AUDI";
	String model;
	String color;
	int maxSpeed;
	
	// Constructor
	public Car() {}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 총4개의 constructor overloading
	// 주의! 매개변수 이름만 바꾸는 것은 오버로딩이 아님
	
	// Quiz: Overloading 가능한지? => 서로 다른 타입의 순서가 바뀌면 가능 / but 위 생성자와 같은 역할이므로 이렇게는 안 씀
	public Car(String model, int maxSpeed, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
