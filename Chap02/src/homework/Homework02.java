package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로: ");
		double roomWidth = scanner.nextDouble();
		
		System.out.print("세로: ");
		double roomHeight = scanner.nextDouble();
		
		double roomArea = roomWidth * roomHeight;
		double roomRound = (roomWidth + roomHeight) * 2;
		
		System.out.printf("면적: %.2f\n", roomArea);
		System.out.printf("둘레: %.1f", roomRound);
	}
}
