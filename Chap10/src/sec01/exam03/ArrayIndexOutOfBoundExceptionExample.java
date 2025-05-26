package sec01.exam03;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		// 사용자의 잘못된 사용까지 고려하는 좋은 프로그래밍
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] = " + data1);
			System.out.println("args[1] = " + data2);
		} else {
			System.out.println("두 개의 실행 인자가 필요합니다.");
		}
		// 위 코드는 예외 처리 코드가 아님 => 예외 처리는 예외 발생 시 실행되는 코드 / 처리 방법을 작성
	}
}
