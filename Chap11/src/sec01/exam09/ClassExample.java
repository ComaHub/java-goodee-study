package sec01.exam09;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// Class 클래스 객체
		// 자바에서 특정 클래스의 메타데이터를 표현하는 객체
		// JVM 내 하나의 클래스당 하나의 Class 클래스 객체만 존재
		
		// Car 클래스의 Class 클래스 객체 얻기
		// 방법 1)
		Class classCarData01 = Car.class;
		
		// 방법 2)
		Class classCarData02 = Class.forName("sec01.exam09.Car");
		
		// 방법 3)
		Car car = new Car();
		Class classCarData03 = car.getClass();
		
		// 1, 2, 3으로 얻은 참조값은 모두 같은 Class 클래스 객체를 참조함
		System.out.println(classCarData01 == classCarData02);
		System.out.println(classCarData01 == classCarData03);
		
		System.out.println(classCarData01.getName());
		System.out.println(classCarData01.getSimpleName());
		System.out.println(classCarData01.getPackage().getName());
		System.out.println(classCarData01.getPackageName()); // 위보다는 이걸 쓰자
		
		// 이외에도 필드/생성자/메서드 정보도 얻을 수 있음 => 이 정보를 얻어 활용하는 것을 reflection이라고 함
	}
}
