package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode = " + keyCode);
			
			if (keyCode == 'q') break;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
