package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korPoint = scanner.nextInt();
		
		System.out.print("수학: ");
		int mathPoint = scanner.nextInt();
		
		System.out.print("영어: ");
		int engPoint = scanner.nextInt();
		
		int sum = korPoint + mathPoint + engPoint;
		int avg = sum / 3;
		
		System.out.printf("합계: %d점\n평균: %d점\n", sum, avg);
		System.out.println(avg < 90 || korPoint < 60 || mathPoint < 60 || engPoint < 60 ? "휴대폰을 바꿀 수 없습니다." : "휴대폰을 바꿀 수 있습니다!");
	}
}
