package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if (score < 90) // 중괄호를 생략하면 다음 코드 한 줄만 실행함
			System.out.println("점수가 90보다 작습니다.");
		  System.out.println("등급은 B입니다.");
		  
		// 익숙하지 않으면 중괄호를 명시하자
	}
}
