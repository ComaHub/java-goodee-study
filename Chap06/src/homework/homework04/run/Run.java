package homework.homework04.run;

import homework.homework04.controller.ExMethodController;

public class Run {
	public static void main(String[] args) {
		ExMethodController emc = new ExMethodController();
		
		emc.printMessage("Hello World!");
		
		int result1 = emc.sum1To100();
		System.out.println("result1 = " + result1);
		
		String result2 = emc.isEvenOrOdd(503);
		System.out.println("result2 = " + result2);
		
		String result3 = emc.isEvenOrOdd(502);
		System.out.println("result3 = " + result3);
		
		boolean result4 = emc.isHaveAlphabet("1a가2b나3c다");
		System.out.println("result4 = " + result4);
		
		boolean result5 = emc.isHaveAlphabet("1가2나3다");
		System.out.println("result5 = " + result5);
		
		int result6 = emc.isStringHaveChar("Hello World", 'o');
		System.out.println("result6 = " + result6);
		
		emc.printMultiTable(9);
	}
}
