package sec01.exam13;

public class StringCharAtExample {
	public static void main(String[] args) {
		// 주민등록번호에서 남자 / 여자를 구분하는 방법
		String ssn = "010624-1230123";
		
		switch (ssn.charAt(7)) {
			case '1', '3' -> {
				System.out.println("남자입니다.");
			}
			case '2', '4' -> {
				System.out.println("여자입니다.");
			}
		};
	}
}
