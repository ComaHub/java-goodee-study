package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		System.out.println("------");
		
		// 변수의 업캐스팅
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("------");
		
		// 매개변수의 업캐스팅 (매개변수의 다형성)
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

// 추상 클래스의 용도
// 1. 설계 규격을 만들고자 할 때
// 반드시 존재해야 할 공통 필드와 메소드의 선언(특히, 추상 메소드는 구현을 강제할 수 있음)

// 2. 실체 클래스를 작성할 때 시간 절약
// 공통된 내용은 물려받고, 추가적인 필드와 메소드만 선언

// 3. 공통 필드와 메소드의 이름을 통일할 목적
// 실체 클래스의 설계자가 여러 사람일 경우, 제각기 다른 이름을 가질 수 있음을 방지

// 정리: 
// 공통 기능 제공 + 규격 정의
// 설계 규격을 명확하게 정의하고, 일부 공통 기능까지 제공하고 싶다면 추상 클래스

// 참고로 인터페이스는 순수한 설계 규격 정의
// 설계 규격만 정의하고, 다중 구현이 필요 하다면 인터페이스
