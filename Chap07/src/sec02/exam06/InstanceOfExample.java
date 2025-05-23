package sec02.exam06;

public class InstanceOfExample {
	public static void main(String[] args) {
		Parent parent = new Parent();
		// Child child = (Child) parent; => ClassCastException!
		// downcasting 전에는 꼭 검사를 하자 (객체 instanceo of 클래스)
		
		if (parent instanceof Child) { // parent가 참조하는 객체는 Child의 instance인가?
			Child child = (Child) parent; // downcasting
			System.out.println("downcasting 성공");
		}
		
		// Java 12부터 추가된 문법
		// instanceof의 결과가 true이면 자동으로 downcasting
		if (parent instanceof Child child) {
			System.out.println("downcasting 성공");
		}
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		
	}
	
	public static void method1(Parent parent) {
		// 안전하게 타입 검사 후 변환
		// Child child = (Child) parent;
		if (parent instanceof Child child) {
			System.out.println("method1 - Child로 downcasting 성공");			
		} else {
			System.out.println("method1 - Child로 downcasting 실패");
		}
	}
}
