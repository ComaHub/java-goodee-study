package sec01.exam06;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//final method: 자식이 실수로 재정의하는 것을 방지
	public final void stop() {
		System.out.println("차량을 정지합니다.");
		speed = 0;
	}
}
