package homework.homework03.main;

import homework.homework03.util.Utility;

public class Main {
	public static void main(String[] args) {
		Utility util = new Utility();
		
		String result1 = util.addString("Hello", "World");
		System.out.println("result1 = " + result1);
		
		int result2 = util.multiply(5, 3);
		System.out.println("result2 = " + result2);
		
		int result3 = util.multiply(3, 5);
		System.out.println("result3 = " + result3);
		
		boolean result4 = util.isEqual("Hello", "World");
		System.out.println("result4 = " + result4);
		
		boolean result5 = util.isEqual("Yuni", "Yuni");
		System.out.println("result5 = " + result5);
	}
}
