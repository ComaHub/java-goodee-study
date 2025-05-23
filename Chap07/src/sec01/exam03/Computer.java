package sec01.exam03;

class Computer extends Calculator {
	@Override // Annotation: @Override하는 것이 목적임을 명시하면 제대로 되었는지 컴파일 단계에서 검사해줌
	double areaCircle(double r) {
		System.out.println("Computer - areaCircle() 실행");
		return Math.PI * r * r; // 자바에서 제공하는 정확한 PI값을 사용하도록 메소드를 오버라이딩
	}
	
	// 선언부가 서로 다르면...
	// @Override 
	// double areaCircle(double r) {
	//	 System.out.println("Computer - areaCircle() 실행");
	//	 return Math.PI * r * r;
	// }
}
