package sec02.exam05;

public class ThrowsExample {
	// main에서도 예외를 넘기면 => main method를 호출한 JVM이 받아서 처리
	// JVM은 단순히 예외를 콘솔에 출력하고 프로그램을 종료함
	public static void main(String[] args) {
		try {
			findClass(); // 여기서 compile error 발생
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace(); // 발생한 예외의 내용을 추적해 콘솔에 출력 (개발 시 디버깅에 사용)
			System.out.println(e.getMessage()); // 예외 메시지 출력 (예외 발생 시 생성자의 인자로 사용한 메시지를 반환)
			System.out.println(e.toString()); // 예외 클래스 이름과 메시지를 함께 출력
		}
	}
	
	// 직접 처리하지 않고 호출한 쪽으로 예외 넘기기
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
