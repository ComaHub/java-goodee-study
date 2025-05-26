package sec02.exam03;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		// 2가지 예외 발생 가능
		// 하나의 try-catch문으로 합치기 (다중 catch)
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 인자의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
