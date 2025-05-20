package homework.homework04.controller;

public class ExMethodController {
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public int sum1To100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public String isEvenOrOdd(int number) {
		if (number % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	public boolean isHaveAlphabet(String str) {
		if (str.toUpperCase().equals(str.toLowerCase())) {
			return false;
		} else {
			return true;
		}
	}
	
	public int isStringHaveChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char strChar = str.charAt(i);
			
			if (strChar == c) count++;
		}
		
		return count;
	}
	
	public void printMultiTable(int number) {
		System.out.println("=== " + number + "단 ===");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", number, i, number * i);
		}
	}
}
