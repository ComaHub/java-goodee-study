package sec04.exam02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception { // 발생한 예외를 console에 출력하고 끝냄
		int keyCode;
		
		// 키보드로부터 keycode를 읽을 때 error가 발생할 수 있음 -> 예외처리
		keyCode = System.in.read(); // console에서 키보드로부터 입력을 받을 때까지 대기
		System.out.println("keyCode = " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);
	}
}
