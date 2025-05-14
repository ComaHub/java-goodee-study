package sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		// 정수 타입 산술 연산에서 하나라도 long 타입이면 long으로 자동 변환
		byte x = 20;
		long y = 40;
//		int result = x + y; => Error! byte가 long으로 promotion (long + long)
		long result = x + y;
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		long result2 = value1 + value2 + value3; // (byte to)int + int + long => (int to)long + long
		System.out.println(result2);
	}
}
