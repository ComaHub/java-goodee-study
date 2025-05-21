package sec05.exam06;

class Earth {
	// 상수 만들기 => 생성자에서 초기화할 수 없음
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	// (참고) 선언 시 초기화를 하지 않은 경우 static 블록에서 초기화 가능
	// static {
	// EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	// }
}
