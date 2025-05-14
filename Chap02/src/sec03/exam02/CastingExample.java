package sec03.exam02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65601; => Overflow!
		char charValue = (char) intValue; // Casting to char
		System.out.println(charValue);
		
		long longValue = 500;
//		long longValue = 20000000000L; => Overflow!
		intValue = (int) longValue; // Casting to int (뒤에서 4 byte만 반영)
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // Casting to int (정수 부분만 저장)
		System.out.println(intValue);
	}
}
