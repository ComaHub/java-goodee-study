package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone("Yuni"); => Abstract class의 instance는 생성할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("Kumorin");
		smartPhone.turnOn();
		smartPhone.searchInternet();
		smartPhone.turnOff();
		
		// Abstract class는 객체 생성 자체가 불가능한 것이 아님 => new를 사용해 단독으로 생성할 수가 없는 것
		// 상속받은 child class의 instance가 생성될 때 자신의 instance도 같이 생성됨
	}
}
