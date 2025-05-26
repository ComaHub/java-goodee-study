package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} 
		//catch (Exception e) {
		//	System.out.println("실행에 문제가 있습니다."); => 예외를 혼자 다 잡아버림
		//} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 인자의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		} catch (Exception e) { // 모든 예외는 Exception 클래스를 상속 => 다형성에 의해 모든 예외 객체를 받게 됨
			// Exception 타입을 쓰는 경우 => 공통적으로 예외 처리를 할 때 (특정한 예외에 대한 처리가 필요없는 경우)
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
