package sec04.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // 생성자 명시하지 않음 => 컴파일러가 기본 생성자 자동 추가
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // => byte가 int로 promotion
		System.out.println("result2 = " + result2);
		
//		double result = myCalc.divide(10.5, 20.0); => double은 int로 promotion할 수 없음
		
		myCalc.powerOff();
	}
}
