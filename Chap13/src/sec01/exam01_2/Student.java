package sec01.exam01_2;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof Student student) return this.name.equals(student.name) && this.age == student.age;
		
		return false;
	}

	@Override
	public int compareTo(Student obj) {
		// compareTo()의 리턴값 의미
		// 음수: this < obj => this가 앞에 옴
		// 양수: this > obj => this가 뒤로 감
		// 0: this == obj => 변화 없음
		
		// 나이 오름차순
		return this.age - obj.age;
	}
}
