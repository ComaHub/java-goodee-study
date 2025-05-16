package homework.loop;

import java.util.Scanner;

class Practice {
	int practice01(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) continue;
			
			sum += i;
		}
		
		return sum;
	}
	
	void practice02(int num) {
		for (int i = num; i <= 9; i++) {
			System.out.println("===" + i + "단 ===");
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}
	}
	
	void practice03(Scanner scanner) {
		for (; true; ) {
			System.out.print("입력: ");
			String input = scanner.nextLine();
			
			if ("탈출".equals(input)) break;
			System.out.println(input);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	void practice04(Scanner scanner) {
		String input = null;
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이 하시겠습니까? (yes / no): ");
			input = scanner.nextLine();
		} while ("yes".equals(input));
		
		System.out.println("게임을 종료합니다.");
	}
	
	int practice05(Scanner scanner) {
		int sum = 0;
		
		while (true) {
			System.out.print("숫자 (0을 입력하면 종료): ");
			int input = scanner.nextInt();
			
			if (input == 0) break;
			if (input < 0) continue;
			
			sum += input;
		}
		
		return sum;
	}
	
	void practice06() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j >= (5 - i) + 1 && j <= (5 + i) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	void practice07(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) System.out.print("박");
			else System.out.print("수");
		}
	}
	
	void practice08(Scanner scanner) {
		boolean isRepeat = true;
		
		Master:
		while (isRepeat) {
			System.out.print("문자열: ");
			String str = scanner.nextLine();
			
			System.out.print("문자: ");
			char c = scanner.nextLine().charAt(0);
			
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				char strChar = str.charAt(i);
				
				if (strChar == c) count++;
			}
			
			System.out.println("포함된 개수: " + count);
			
			while (true) {
				System.out.print("다시 입력하시겠습니까?: ");
				char inputRepeat = scanner.nextLine().charAt(0);
				
				if (inputRepeat == 'N' || inputRepeat == 'n') {
					isRepeat = false;
					break;
				} else if (inputRepeat == 'Y' || inputRepeat == 'y') {
					continue Master;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}
	}
}
