package sec01.exam05;

//	Quiz
//	철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요. 
//	조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요. 
//	아래와 같은 기준을 따른다고 했을 때, 
//	사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.

//	- 0 : 조명을 끕니다.
//	- 1 : 어두운 조명입니다.
//	- 2 : 밝은 조명입니다.
//	- 3 : 매우 밝은 조명입니다.

//	입력 값이 위의 기준에 해당하지 않으면 "올바른 입력이 아닙니다."라고 출력하세요.

//	[출력]
//	조명의 밝기를 입력하세요 (0~3): 3
//	현재 조명의 밝기: 매우 밝은 조명입니다.

import java.util.Scanner;

public class SwitchQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("조명의 밝기를 입력해주세요 (0 ~ 3): ");
		int lightLevel = scanner.nextInt();
		
		switch (lightLevel) {
			case 0:
				System.out.println("현재 조명의 밝기: 조명을 끕니다.");
				break;
				
			case 1:
				System.out.println("현재 조명의 밝기: 어두운 조명입니다.");
				break;
				
			case 2:
				System.out.println("현재 조명의 밝기: 밝은 조명입니다.");
				break;
				
			case 3:
				System.out.println("현재 조명의 밝기: 매우 밝은 조명입니다.");
				break;
				
			default:
				System.out.println("올바른 입력이 아닙니다.");
		}
	}
}
