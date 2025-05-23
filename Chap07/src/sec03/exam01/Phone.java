package sec03.exam01;

// Abstract class
// 미완성 설계도 (구현되지 않은 메서드를 가지고 있는 클래스)
// Child class들의 공통 메서드는 직접 구현하고, class별로 다르게 작동해야 하는 메서드는 child class에서 구현하도록 선언
// => 중복 코드 최소화, 특정 메서드에 대해 다형성 구현이 가능하도록 강제

// 이 예제는 공통 기능만 제공 => 굳이 추상화를 해야하나? => class 자체가 object 생성이 목적이 아님을 개발자가 명시하는 것 + 불필요한 객체 생성 방지
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("핸드폰의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("핸드폰의 전원을 끕니다.");
	}
}
