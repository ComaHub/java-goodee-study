package sec01.exam24;

public class AutoBoxingUnboxingExample {
	public static void main(String[] args) {
		// 오토 박싱
		Integer obj = 100; // Wrapper 객체 생성됨
		System.out.println("value = " + obj.intValue());
		
		// 오토 언박싱
		// 대입할 때
		int value = obj; // Wrapper 내부 기본 타입 값을 꺼내 대입 
		System.out.println("value = " + value);
		
		// 연산할 때
		int result = obj + 100;
		System.out.println("result = " + result);
		
	}
}
