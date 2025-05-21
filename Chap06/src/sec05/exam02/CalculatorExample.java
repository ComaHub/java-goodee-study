package sec05.exam02;

public class CalculatorExample {
	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기
		
		// 잘못된 접근 (메모리 낭비)
		Calculator calc = new Calculator();
		double result1 = 10 * 10 * calc.pi;
		System.out.println("result1 = " + result1);
		
		// static 사용
		double result2 = 10 * 10 * Calculator.pi;
		System.out.println("result2 = " + result2);
		
		int result3 = Calculator.plus(10, 5);
		int result4 = Calculator.minus(10, 5);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
	}
}
