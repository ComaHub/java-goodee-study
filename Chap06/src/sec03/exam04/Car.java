package sec03.exam04;

public class Car {
	// Field
	String company = "AUDI";
	String model;
	String color;
	int maxSpeed;
	
	// Constructor
	public Car() {
		this("A5", "Silver", 250);
		
//	this.model = "A5";
//	this.color = "Silver";
//	this.maxSpeed = 250;
	}
	
	public Car(String model) {
		this(model, "Silver", 250);
		
//	this.model = model;
//	this.color = "Silver";
//	this.maxSpeed = 250;
	}
	
	public Car(String model, String color) {
		this(model, color, 250);
		
//	this.model = model;
//	this.color = color;
//	this.maxSpeed = 250;
	}
	
	public Car(String model, String color, int maxSpeed) {
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 정리: 중복된 필드 초기화 코드들이 하나의 생성자로 집중되어 가독성과 유지보수에 좋음
}
