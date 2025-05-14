package sec03.exam05;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; => Error!
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// char (연산시 int로 promotion)
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; => Error!
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);
		// 문자로 출력하려면 char로 casting
		System.out.println("출력문자: " + (char) intValue2);
		
		// 정수 / 정수 = 정수
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수 연산의 결과는 정수 => 10 / 4 = 2
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);
		
		// 실수 결과를 얻으려면
		double doubleValue2 = intValue3 / 4.0;
		System.out.println(doubleValue2);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
//		double result = x / (double) y;
//		double result = (double) x / (double) y; => 3가지 모두 가능
		System.out.println(result);
	}
}
