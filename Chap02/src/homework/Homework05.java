package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어: ");
		double korPoint = scanner.nextDouble();
		
		System.out.print("영어: ");
		double engPoint = scanner.nextDouble();
		
		System.out.print("수학: ");
		double mathPoint = scanner.nextDouble();
		
		int sum = (int) (korPoint + engPoint + mathPoint);
		int avg = sum / 3;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
}
