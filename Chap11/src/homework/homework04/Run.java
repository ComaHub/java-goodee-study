package homework.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
		
		String inputword;
		while (true) {
			System.out.print("문자열: ");
			inputword = scanner.nextLine();
			
			if ("N".equalsIgnoreCase(inputword)) break;
			
			stringBuffer.append(inputword);
		}
		
		System.out.println("프로그램을 종료합니다.");
		System.out.println("최종 문자열: " + stringBuffer.toString());
	}
}
