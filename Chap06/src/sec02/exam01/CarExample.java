package sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		// 외부 클래스에서의 필드 사용
		// => 객체를 생성한 후 해당 객체를 통해 접근
		// 필드는 객체의 데이터 => 객체 없이는 사용할 수 없음
		
		// 객체 생성
		Car myCar = new Car(); // new 연산자 + 생성자 호출
		
		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company); // dot 연산자 (객체 접근 연산자)
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.currentSpeed); // 초기값이 없으므로 기본값 0이 들어감
		
		// 필드값 변경
		myCar.currentSpeed = 60;
		System.out.println("수정된 속도: " + myCar.currentSpeed);
	}
}
