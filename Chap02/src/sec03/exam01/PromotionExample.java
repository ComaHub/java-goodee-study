package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // Promotion (1 byte -> 4 byte)
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';
		intValue = charValue; // Promotion (2 byte -> 4 byte)
		System.out.println("intValue = " + intValue);
		
		intValue = 30;
		long longValue = intValue; // Promotion (4 byte -> 8 byte)
		System.out.println("longValue = " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // Promotion (8 byte -> float(실제 저장할 수 있는 값의 크기가 더 큼))
		System.out.println("floatValue = " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // Promotion (float -> double)
		System.out.println("doubleValue = " + doubleValue);
		
		
		// 주의! Byte를 Char로 Promotion은 불가
		byte byteVal = 65;
//		char charVal = byteVal; // char는 음수를 포함하지 않는데 byte 타입은 음수를 포함
		System.out.println("byteVal = " + byteVal);
	}
}
