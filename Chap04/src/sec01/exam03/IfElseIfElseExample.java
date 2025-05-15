package sec01.exam03;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) { // 80 이상 90 미만
			System.out.println("점수는 80 ~ 89점 입니다.");
		  System.out.println("등급은 B입니다.");
		} else if (score >= 70) { // 70 이상 80 미만
			System.out.println("점수는 70 ~ 79점 입니다.");
		  System.out.println("등급은 C입니다.");
		} else { // 70 미만
			System.out.println("점수는 70점 미만입니다.");
		  System.out.println("등급은 D입니다.");
		}
		
		// 정리
		// 1. 조건식 여러 개 작성 가능 (개수 제한 없음)
		// 2. 조건식이 true가 되는 블록만 실행하고 구문을 빠져나옴
	}
}
