package sec02.exam02.quiz;

public class TryCatchFinallyFlow {
	public static void main(String[] args) {
		// Quiz: 실행 흐름 예측
		
		// 1. 예외가 발생하지 않은 경우
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 3 5 6
		
		// 2. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(0/0); // 예외 발생 => 일치하는 catch 블럭이 있는지 확인 => 예외 처리됨
			
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 4 5 6
		
		// 3. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(args[0]); // 예외 발생 => 일치하는 catch 블럭이 없으면 예외 처리되지 않음 => 비정상 종료
			
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 5
	}
}
