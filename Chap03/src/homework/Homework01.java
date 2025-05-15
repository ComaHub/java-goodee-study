package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		System.out.println("앵무새: " + ("간다".equals(scanner.nextLine()) ? "온다" : "간다"));
		// 문자열 비교 시 literal이 앞에 오면 String 변수 값이 null일 때의 error를 방지할 수 있음
	}
}
