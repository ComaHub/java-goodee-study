package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String inputWord = scanner.nextLine();
		
		if (inputWord.length() >= 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		char inputCharValue = inputWord.charAt(0);
		System.out.println(inputWord + "의 유니코드: " + (int) inputCharValue);
	}
}
