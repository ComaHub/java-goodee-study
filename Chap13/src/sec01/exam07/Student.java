package sec01.exam07;

import java.util.Objects;

// 키로 사용할 객체 생성 클래스
public class Student {
	private int studentNo;
	private String name;
	
	public Student() {}

	public Student(int studentNo, String name) {
		this.studentNo = studentNo;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student other) return Objects.equals(name, other.name) && studentNo == other.studentNo;
		else return false;
	}
	
}
