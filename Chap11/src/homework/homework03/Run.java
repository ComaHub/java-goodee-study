package homework.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputEmail = scanner.nextLine().trim();
		
		if (!("@goodee.co.kr".equals(inputEmail.substring(inputEmail.indexOf("@"))))) {
			System.out.println("유효하지 않은 이메일입니다.");
			return;
		}
		
		System.out.println(inputEmail.substring(0, inputEmail.indexOf("@")).toUpperCase());
	}
}
