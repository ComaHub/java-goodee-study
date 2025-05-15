package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구슬의 개수: ");
		int amountBall = scanner.nextInt();
		
		System.out.println("구슬의 개수는 " + (amountBall % 2 == 0 ? "짝수입니다." : "홀수입니다."));
	}
}
