package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	// 동등 객체 판단을 위한 클래스를 만들 때 => equals()와 hashCode()를 함께 오버라이딩하는 것이 일반적임
	// Objects.hash(...) => 자바에서 여러 필드를 조합해 간편하게 hashCode()를 만들어주는 유틸리티 메서드 (가변 인자를 받아 적절한 해시코드를 반환)
	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (obj instanceof Student student) {
			return (this.studentNo == student.studentNo) && (this.name.equals(student.name));
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "[학번: " + studentNo + ", 이름: " + name + ", 전공: " + major + "]";
	}
}
