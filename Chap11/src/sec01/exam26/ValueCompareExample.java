package sec01.exam26;

public class ValueCompareExample {
	public static void main(String[] args) {
		// Wrapper 객체 내부의 값 비교 (-128 ~ 127은 캐싱해놓기 때문에 == 비교도 가능하지만 참고만 하자)
		// 언박싱한 값으로 비교하거나 equals()를 사용
		
		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300; // Auto boxing
		Integer obj2 = 300;
		System.out.println("연산자 비교: " + (obj1 == obj2));
		System.out.println("Unboxing 후 연산자 비교: " + ((obj1.intValue()) == (obj2.intValue())));
		System.out.println("equals() 비교: " + obj1.equals(obj2));
		
		// -128 ~ 127 범위 내의 Integer 객체는 하나를 돌려씀
		System.out.println("[-128 ~ 127 범위 내일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("연산자 비교: " + (obj3 == obj4)); // 참조값 비교임을 잊지 말자!
		System.out.println("Unboxing 후 연산자 비교: " + ((obj3.intValue()) == (obj4.intValue())));
		System.out.println("equals() 비교: " + obj3.equals(obj4));
		
		// 내부 값 비교 시에는 equals()를 쓰자!
	}
}
