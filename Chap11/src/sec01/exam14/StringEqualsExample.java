package sec01.exam14;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("정윤희");
		String strVar2 = "정윤희";
		String strVar3 = "정윤희";
		
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("서로 다른 String 객체를 참조");
		}
		
		if (strVar2 == strVar3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("서로 다른 String 객체를 참조");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("서로 다른 문자열을 가짐");
		}
		
		if (strVar2.equals(strVar3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("서로 다른 문자열을 가짐");
		}
	}
}
