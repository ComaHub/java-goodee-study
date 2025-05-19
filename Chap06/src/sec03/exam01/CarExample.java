package sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
//		Car myCar = new Car(); => 기본 생성자가 선언되지 않아 compile error 발생 / 생성자를 하나라도 명시하면 자동으로 기본 생성자를 넣어주지 않음
		
		// 선언한 생성자에 맞게 인수 제공
		Car myCar = new Car("Black", 3000);
	}
}
