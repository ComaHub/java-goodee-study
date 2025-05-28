package sec01.quiz_string;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputStr = scanner.nextLine();
		
		int sum = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			try {
				sum += Integer.parseInt(inputStr.charAt(i) + "");
			} catch (NumberFormatException e) {
				continue;
			}
		}
		
		// 참고: Character.isDigit(c) => char c가 숫자면 true 아니면 false
		// Character.getNumericValue(c) => char c의 값을 정수로 변환('3'을 3으로)
		
		System.out.println(sum);
	}
}
