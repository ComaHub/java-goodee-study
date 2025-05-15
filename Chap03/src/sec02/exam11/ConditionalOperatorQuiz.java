package sec02.exam11;

// Quiz
// 0 ~ 100 사이 점수를 입력받아 60점 이상은 "합격", 미만이면 "불합격" 출력하기
// 음수이거나 100이 넘는 점수는 "점수입력오류"로 예외처리

import java.util.Scanner;

public class ConditionalOperatorQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputGrade = scanner.nextInt();
		
		System.out.println(((inputGrade < 0) || (inputGrade > 100)) ? "점수 입력 오류" :
												(inputGrade >= 60) ? "합격" : "불합격");
	}
}
