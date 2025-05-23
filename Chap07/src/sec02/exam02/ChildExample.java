package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // Parent type으로 upcasting
		
		parent.method1();
		parent.method2(); // child class에서 overriding된 method 호출
		// parent.method3(); => Parent type에서는 child object의 고유 field나 method가 보이지 않음 (접근 불가)
		
		// 정리: 참조 변수의 타입은 객체를 다룰 수 있는 리모컨과 같다
	}
}
