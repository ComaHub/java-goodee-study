package sec01.exam23;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// Wrapper 객체: primitive 타입의 값을 갖는 ㅐ겍ㄹ[
		
		// Boxing: 기본 타입 값을 포장 객체로 만듦
		// 1. 생성자 이용
		Integer obj1 = new Integer(100); // 기본 타입 값 100을 포장하는 Integer
		Integer obj2 = new Integer("200"); // 문자열도 가능
		
		// 2. valueOf() 메서드 이용
		Integer obj3 = Integer.valueOf(300);
		Integer obj4 = Integer.valueOf("400");
		
		// Unboxing: 포장 객체를 뜯어 기본 타입 값으로 만듦
		int value1 = obj1.intValue(); // obj1 객체 안의 기본형 100을 꺼낾
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}
