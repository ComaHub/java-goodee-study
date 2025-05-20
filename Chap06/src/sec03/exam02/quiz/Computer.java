package sec03.exam02.quiz;

class Computer {
	String model;
	
	// 기본 생성자
	Computer() {
		this(null);
	}
	
	// 모델명을 받는 생성자
	Computer(String model) {
		this.model = model;
		printModel();
	}
	
	private void printModel() {
		System.out.println("객체 생성 완료 (모델: " + model + ")");
	}
}
