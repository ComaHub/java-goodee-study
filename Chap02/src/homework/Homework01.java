package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몸무게 (kg) : ");
		double studentWeight = scanner.nextDouble();
		
		System.out.print("키 (m) : ");
		double studentHeight = scanner.nextDouble();
		
		double studentBmi = studentWeight / (studentHeight * studentHeight);
		
		System.out.printf("BMI 지수: %.1f", studentBmi);
	}
}
