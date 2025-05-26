package sec01.exam05;

// 클래스 여러 개 선언 가능 (단, public은 하나만 가능)
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		Cat cat = (Cat) animal; // => CC Exception!
		
		changeDog(new Dog());
		changeDog(new Cat());
	}
	
	public static void changeDog(Animal animal) {
		// 예외를 막기 위해 타입 검사 후 다운캐스팅
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;			
		}
	}
}
