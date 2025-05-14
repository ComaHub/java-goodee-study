package sec03.exam07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		System.out.println("value1 = " + value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.println("value2 = " + value2);
		
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("value3 = " + value3);
		
//	System.out.println(Integer.parseInt("1a")); => Error! 
//		System.out.println(Byte.parseByte("128")); => Error! (out of range)
		
		String str1 = String.valueOf(10);
		System.out.println("str1 = " + str1);
		
		String str2 = String.valueOf(3.14);
		System.out.println("str2 = " + str2);
		
		String str3 = String.valueOf(true);
		System.out.println("str3 = " + str3);
	}
}
