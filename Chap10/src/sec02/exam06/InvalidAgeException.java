package sec02.exam06;

// 사용자 정의 예외 클래스 만들기
// 자바에서 제공하는 표준 예외 클래스 외 특정 상황에 맞는 예외를 만들어야 할 때 사용
// Exception (일반 예외) 또는 RuntimeException (실행 예외) 을 상속해서 만듦
public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message);
	}
}
