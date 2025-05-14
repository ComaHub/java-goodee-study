package homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		String inputStrNum = scanner.nextLine();
		
		if (inputStrNum.length() >= 2) {
			System.out.println("한 자리만 입력해주세요.");
			return;
		}
		
		if (!"1234567890".contains(inputStrNum)) {
			System.out.println("숫자만 입력해주세요.");
			return;
		}
		
		char inputCharNum = inputStrNum.charAt(0);
		int inputNum = inputCharNum - '0';
		System.out.println("입력한 숫자의 제곱은 " + (inputNum * inputNum) + "입니다.");
		
	}
}
