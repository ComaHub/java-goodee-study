package sec01.exam03;

// Quiz
// 한 개의 문자를 입력받아 대문자, 소문자, 숫자, 기타 문자인지 출력하는 프로그램 구현

import java.util.Scanner;

public class IfElseIfElseQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char inputChar = scanner.nextLine().charAt(0);
		if ((inputChar >= 'A') && (inputChar <= 'Z')) {
			System.out.println("대문자입니다.");
		} else if ((inputChar >= 'a') && (inputChar <= 'z')) {
			System.out.println("소문자입니다.");
		} else if ((inputChar >= '0') && (inputChar <= '9')) {
			System.out.println("숫자입니다.");
		} else {
			System.out.println("기타 문자입니다.");
		}
	}
}
