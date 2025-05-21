package sec05.exam01;

class Car {
	// Instance Field
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}

	// Instance Method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 " + this.speed + "km/h의 속도로 달립니다.");
		}
	}
}
