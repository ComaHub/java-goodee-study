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
		// 25 - 30 = -5 => 음수 => 25세가 앞으로 감
		return this.age - obj.age;
		
		// 나이 내림차순
		// 30 - 25 = 5 => 양수 => 30세가 앞으로 감
		// return obj.age - this.age;
		
		// 오름차순을 풀어서 쓰면
		// if (this.age < obj.age) return -1;
		// else if (this.age > obj.age) return 1;
		// else return 0;
		
		// 문자열은 연산자로 비교 불가
		// String의 오버라이딩된 compareTo() 메서드 사용
		// 기준 문자열이 사전상 뒤에 있으면 자리 바꿈
		
		// "유니".compareTo("타비"); => 음수 => "유니"가 앞으로 감
		// return this.name.compareTo(obj.name); => 오름차순
		// return obj.name.compareTo(this.name); => 내림차순
		
		// 복합 비교 가능
		// 기본 정렬은 나이 오름차순
		// 나이가 같다면 이름순
		// if (this.age != obj.age) {
		//	  나이순
		// } else {
		//	  이름순
		// }
	}
}
