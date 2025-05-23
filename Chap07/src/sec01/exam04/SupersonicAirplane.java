package sec01.exam04;

//비행기 특성을 상속받고 초음속 비행 기능 추가
public class SupersonicAirplane extends Airplane {
	//비행 모드를 상수로 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속으로 비행합니다.");
		} else {
			// 부모의 메소드와 비슷한 내용을 또 작성하면 비효율적
			super.fly(); // 부모의 fly() 메소드를 호출
		}
	}
}
