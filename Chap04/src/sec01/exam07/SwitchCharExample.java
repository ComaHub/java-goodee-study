package sec01.exam07;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		// char 타입 변수도 가능 (대소문자 구분)
		// 여러 case를 묶을 수 있음
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
				
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
				
			default: System.out.println("손님입니다.");
		}
	}
}
