package sec03.exam02;

// 공통 기능 제공 + 특정 메서드 구현 강제
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드 (추상 클래스 내에서만 정의 가능)
	// 미완성 메서드 => 실행 코드가 없음
	// 반드시 구현해야 하는 메서드이지만 자식마다 다르게 구현해야 하는 경우
	// 동일한 메서드명으로 구현할 것을 강제함
	public abstract void sound();
}
