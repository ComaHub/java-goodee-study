package sec04.exam02;

class Computer {
	// 매개값의 수와 상관없이 모두 더해서 리턴하는 메소드
	
	// 1. 매개변수를 배열 타입으로 선언
	int sum1(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		
		return sum;
	}
	
	// 2. 매개변수를 가변인자로 선언 => 인자들을 포함한 하나의 배열로 간주하고 사용
	int sum2(int ... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		
		return sum;
	}
}
