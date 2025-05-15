package sec01.exam05;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
				
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
				
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
				
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
				
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
				
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
				
			default: // <= Optional
		}
		
		
		// if: 조건식의 결과 (true / false) 에 따라 실행
		// switch: 변수의 값에 따라 case 선택 실행 => 조건이 명확한 경우 사용
		
	}
}
