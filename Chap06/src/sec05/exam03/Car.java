package sec05.exam03;

class Car {
	// Instance Field
	int speed;
	
	// Instance Method
	void run() {
		System.out.println(speed + "km/h의 속도로 달립니다.");
	}
	
	// Static Method
	static void test() {
		// Static Method에서는 Instance Field, Instance Method, this 사용 불가
		// this.speed = 60;
		// run();
		
		// Instance member를 굳이 사용하고 싶으면...
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		// ...하지만 이럴 바엔 static으로 만들지 않는 것이 더 좋음
	}
	
	public static void main(String[] args) {
		test();
	}
}
