package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	// 생성자를 명시하지 않으면 컴파일러가 기본 생성자 추가
	// => but 이 클래스는 부모 클래스에서 명시한 생성자가 모두 매개변수를 요구하기 때문에 반드시 명시해야 함
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성");
	}
}
