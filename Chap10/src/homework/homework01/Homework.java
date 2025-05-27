package homework.homework01;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int randomNum = (int) (Math.random() * 50) + 1;
		int count = 0;
		
		while (true) {
			try {
				System.out.print("1 ~ 50 사이의 숫자: ");
				int inputNum = Integer.parseInt(scanner.nextLine());
				
				count++;
				if (inputNum == randomNum) {
					System.out.println("축하합니다~ 정답입니다!");
					System.out.println("총 시도 횟수: " + count);
					break;
				} else if (inputNum > randomNum) {
					System.out.println("Down!");
				} else {
					System.out.println("Up!");
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			}
		}
	}
}
