package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); // Student 객체 하나 생성 후 객체의 참조값을 Student 클래스 변수 s1에 저장
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1); // 객체의 정보를 문자열로 변환해 출력 (패키지 + 클래스 + 참조값)
		System.out.println(s1.hashCode()); // 참조값을 10진수 int 타입으로 반환
		
		Student s2 = new Student(); // 새로운 Student 객체를 생성 후 참조값을 s2에 저장 => s1이 참조하는 객체와 별개
		System.out.println("s2 변수가 새로운 Student 객체를 참조합니다.");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		if (s1 == s2) { // 참조값이 같은지 확인 => 같은 객체를 참조하는가?
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("서로 다른 객체를 참조");
		}
	}
}
