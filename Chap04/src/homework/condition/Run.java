package homework.condition;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Practice practice = new Practice();
		
		System.out.print("실행할 기능을 선택하세요.\n"
				+ "1. 놀이동산 입장료 계산하기\n"
				+ "2. 일기예보\n"
				+ "3. 세 개의 정수 비교하기\n"
				+ "4. 철수네 공장\n"
				+ "5. 헬스 마니아 철수\n"
				+ "6. 합격인가? 불합격인가?\n"
				+ "선택: ");
		
		int selectNum = scanner.nextInt();
		
		switch (selectNum) {
			case 1:
				System.out.print("=== 놀이동산 입장료 계산하기 ===\n나이: ");
				int inputAge = scanner.nextInt();
				int result = practice.practice01(inputAge);
				System.out.println("당신의 놀이동산 요금은 " + result + "원입니다.");
				break;
				
			case 2:
				System.out.print("=== 일기예보 ===\n월: ");
				int inputMonth = scanner.nextInt();
				
				System.out.print("기온: ");
				int inputTemp = scanner.nextInt();
				
				System.out.println(practice.practice02(inputMonth, inputTemp));
				break;
				
			case 3:
				System.out.print("=== 세 개의 정수 비교하기 ===\n첫 번째 정수: ");
				int inputNum1 = scanner.nextInt();
				
				System.out.print("두 번째 정수: ");
				int inputNum2 = scanner.nextInt();
				
				System.out.print("세 번째 정수: ");
				int inputNum3 = scanner.nextInt();
				
				System.out.println("세 수 중에서 가장 작은 수는 " + practice.practice03(inputNum1, inputNum2, inputNum3) + "입니다.");
				break;
				
			case 4:
				System.out.print("=== 철수네 공장 ===\n수집된 코드: ");
				int inputCode = scanner.nextInt();
				
				System.out.println(practice.practice04(inputCode));
				break;
				
			case 5:
				System.out.print("=== 헬스 마니아 철수 ===\n"
												+ "1. 스쿼트\n"
												+ "2. 데드리프트\n"
												+ "3. 벤치 프레스\n"
												+ "4. 풀업\n"
												+ "5. 종료\n");
				int inputRoutine = scanner.nextInt();
				
				System.out.println(practice.practice05(inputRoutine));
				break;
				
			case 6:
				System.out.print("=== 합격인가? 불합격인가? ===\n"
												+ "각 과목의 점수를 입력하세요.\n"
												+ "소프트웨어 설계 점수: ");
				int inputScore1 = scanner.nextInt();
				
				System.out.print("소프트웨어 개발 점수: ");
				int inputScore2 = scanner.nextInt();
				
				System.out.print("데이터베이스 구축 점수: ");
				int inputScore3 = scanner.nextInt();
				
				System.out.print("프로그래밍언어 활용 점수: ");
				int inputScore4 = scanner.nextInt();
				
				System.out.print("정보시스템 구축관리 점수: ");
				int inputScore5 = scanner.nextInt();
				
				System.out.println(practice.practice06(inputScore1, inputScore2, inputScore3, inputScore4, inputScore5));
				break;
		}
	}
}
