package sec02.exam08;

public class BooleanExample {
	public static void main(String[] args) {
		// boolean (1 byte)
		// true, false 둘 중 하나의 값을 저장
		// 제어문에서 실행 흐름 변경 시 사용
		
//	boolean stop = true;
		boolean stop = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
