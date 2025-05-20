package sec04.exam06;

public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	// overloading 조건
	// 1. method 이름이 같아야 함
	// 2. 매개변수의 개수, 타입, 순서가 달라야 함
	// 3. 매개변수명, 리턴 타입이 다른 것과는 상관없음
	
	// method overloading을 하는 이유?
	// 다양한 형태의 인수를 받아 처리하기 위함
	// overloading을 쓰지 않으면 같은 기능을 각각 다른 이름의 method로 정의해야 함 => 불편
}
