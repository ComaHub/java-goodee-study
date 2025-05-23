package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//@Override
	//public void stop() { // final method => overriding할 수 없음! 
	//	System.out.println("스포츠카를 멈춥니다.");
	//	speed = 0;
	//}
}
