package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "유니";
		String strVar2 = "유니";
		
		// 주소값 비교 => 동일한 객체를 참조하고 있는지?
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 같은 객체를 참조");
		} else {
			System.out.println("strVar1과 strVar2는 서로 다른 객체를 참조");
		}
		
		// 내부 문자열 비교
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 동일한 값을 가짐");
		} else {
			System.out.println("strVar1과 strVar2는 서로 다른 값을 가짐");
		}
		
		String strVar3 = new String("유니");
		String strVar4 = new String("유니");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 같은 객체를 참조");
		} else {
			System.out.println("strVar3과 strVar4는 다른 객체를 참조");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 동일한 값을 가짐");
		} else {
			System.out.println("strVar3과 strVar4는 서로 다른 값을 가짐");
		}
	}
}
