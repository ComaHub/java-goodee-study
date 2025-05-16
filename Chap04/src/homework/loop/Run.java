package homework.loop;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Practice practice = new Practice();
		
		System.out.print("실행할 기능을 입력하세요.\n"
											+ "1. 1 ~ 50까지 짝수 합하기\n"
											+ "2. 구구단 무한반복\n"
											+ "3. 탈출합시다!\n"
											+ "4. 게임 재시작\n"
											+ "5. 양수만 더하기\n"
											+ "6. 트리 만들기\n"
											+ "7. 박수박수박\n"
											+ "8. 문자열의 개수\n"
											+ "선택: ");
		
		int inputSelect = scanner.nextInt();
		scanner.nextLine();
		System.out.println("------------------------------");
		
		switch (inputSelect) {
			case 1:
				while (true) {
					System.out.print("정수 (1 ~ 50): ");
					int inputCase1 = scanner.nextInt();
					
					if (inputCase1 < 1 || inputCase1 > 50) {
						System.out.println("1 ~ 50 사이의 정수를 입력하세요.");
					} else {
						System.out.println("합계: " + practice.practice01(inputCase1));
						break;
					}
				}
				break;
				
			case 2:
				int inputCase2;
				
				while (true) {
					System.out.print("숫자: ");
					inputCase2 = scanner.nextInt();
					
					if (inputCase2 < 0) {
						System.out.println("양수만 입력해주세요.");
						continue;
					}
					
					if (inputCase2 > 9) {
						System.out.println("9 이하의 숫자만 입력해주세요.");
						continue;
					}
					
					if (inputCase2 == 0) {
						return;
					}
					
					practice.practice02(inputCase2);
				}
				
			case 3:
				practice.practice03(scanner);
				break;
				
			case 4:
				practice.practice04(scanner);
				break;
				
			case 5:
				System.out.println("양수의 합계: " +  practice.practice05(scanner));
				break;
				
			case 6:
				practice.practice06();
				break;
				
			case 7:
				int inputCase7;
				
				while (true) {
					System.out.print("정수: ");
					inputCase7 = scanner.nextInt();
					
					if (inputCase7 <= 0) {
						System.out.println("양수가 아닙니다.");
						continue;
					}
					
					practice.practice07(inputCase7);
					break;
				}
				
				break;
				
			case 8:
				practice.practice08(scanner);
				break;
		}
	}
}
