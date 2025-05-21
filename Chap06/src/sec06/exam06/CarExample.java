package sec06.exam06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// System.out.println(myCar.speed); => private!
		// myCar.speed = -50;
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");
		
	// 정리:
	// 캡슐화는 필드를 숨기고(private)
	// 접근자 메소드(get/set)를 제공하여
	// 객체 내부 데이터의 무분별한 접근을 막는 방식
		
	// 객체지향 4대 특징(캡슐화, 상속, 다형성 + 추상화)
	// 캡슐화는 약(캡슐)처럼 속은 보이지 않고, 껍데기만 보이게 만드는 것
	// 약(객체) 속에는 여러 성분(데이터와 로직)이 있지만, 우리는 그냥 캡슐을 먹기만 함
	// 자바에서도 객체 속 내용(필드)을 직접 건드리지 않고, 정해진 방법(제공된 메소드)으로만 사용	
	}
}
