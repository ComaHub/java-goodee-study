package sec05.exam04;

class Singleton {
	// Step 1. 생성자 접근 차단
	private Singleton() {}
	
	// Step 2. 유일 객체를 담을 변수 선언 후 참조값 대입 + 필드 접근 차단
	private static Singleton singleton = new Singleton();
	
	// Step 3. 유일 객체의 참조값을 리턴하는 getInstance() 메소드 생성
	public static Singleton getInstance() {
		return singleton;
	}
}
