package sec04.exam04;

class Calculator {
	// Method
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		return plus(x, y) / 2.0;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행 결과: " + result);
	}
	
	// 내부 호출 연습
	void println(String message) {
		System.out.println(message);
	}
}
