package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("정윤희", "020521-4314655", 1);
		// 생성자 호출 순서
		// 1. Student() => 내부의 super() => People()
		// 2. People() 생성자 종료 => Student()로 돌아옴
		// 3. Student() 생성자 나머지 코드 실행 후 종료
		// 즉, 부모 객체가 먼저 생성되고 자식이 나중에 생성됨
		
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
		
		// 상속의 이점
		// 1. 부모 클래스 재사용 => 빠른 개발
		// 2. 중복 코드 감소
		// 3. 부모를 수정하면 자식도 모두 수정됨 => 유지보수 편리
	}
}
