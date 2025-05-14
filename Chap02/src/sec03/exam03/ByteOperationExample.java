package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		// 전제: 두 값 중 크기가 큰 타입으로 promotion
		
		// 산술 연산에서 int 타입보다 작은 타입은 int로 promotion
		byte x = 10;
		byte y = 20;
//		byte result = x + y; // Promotion to int (연산시 우선 변환 => int + int)
		int result = x + y;
	}
}
