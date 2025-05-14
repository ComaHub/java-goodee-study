package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String[] words = scanner.nextLine().split("");
		
		if (words.length < 3) {
			System.out.println("3글자 이상 입력해주세요.");
			return;
		}
		
		System.out.println("첫 번째 문자: " + words[0]);
		System.out.println("두 번째 문자: " + words[1]);
		System.out.println("세 번째 문자: " + words[2]);
	}
}
