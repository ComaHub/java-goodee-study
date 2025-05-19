package homework.dimensional;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실행할 기능을 선택하세요.\n"
											+ "1. 키순서대로 앉으세요.\n"
											+ "2. 값 입력 받아 배열 만들기\n"
											+ "3. 올라갔다 내려갔다\n"
											+ "4. 로또 번호 자동 생성기\n"
											+ "5. 컴퓨터와 가위바위보\n"
											+ "6. 배열 늘리기\n"
											+ "7. 문서 복사하기\n"
											+ "8. 오늘의 메뉴판 만들기\n"
											+ "선택: ");
		
		int selectMenu = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("===========================");
		
		switch(selectMenu) {
			case 1:
				int[] studentHeights = {152, 180, 165, 158, 171};
				practice.practice01(studentHeights);
				break;
				
			case 2:
				System.out.print("정수: ");
				int inputCase2 = scanner.nextInt();
				practice.practice02(scanner, inputCase2);
				break;
				
			case 3:
				practice.practice03(scanner);
				break;
				
			case 4:
				practice.practice04();
				break;
				
			case 5:
				practice.practice05(scanner);
				break;
				
			case 6:
				practice.practice06(scanner);
				break;
				
			case 7:
				String[] report = {"Introduction", "Research", "Conclusion"};
				practice.practice07(report);
				break;
				
			case 8:
				String[] menu = {"Burger", "Pizza", "Pasta"};
				String[] add = {"Salad", "Soup"};
				practice.practice08(menu, add);
				break;
		}
	}
}
