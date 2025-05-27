package sec01.exam07;

public class ExitExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			// System 클래스의 모든 멤버는 static
			if (i == 5) System.exit(0); // 정상 종료인 경우 0
		}
		
		System.out.println("마무리 코드");
	}
}
