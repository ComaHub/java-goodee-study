package sec04.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		// 외부에서 호출 시 우선 객체 생성
		Calculator myCalc = new Calculator();
		
		// 참조 변수와 객체 접근 연산자를 통해 메소드 호출
		myCalc.execute();
	}
}
