package sec01.exam01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListExample {
	public static void main(String[] args) {
		// 타입 파라미터로 사용자 정의 객체 사용 시
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("정윤희", 4));
		list.add(new Student("정북희", 1000));
		list.add(new Student("정리제", 700));
		
		// 객체 검색
		// 사용자 정의 객체를 사용하는 경우 indexOf(), contains()가 판단하는 기준은 equals()
		// => equals() 메서드를 오버라이딩해야 함
		if (list.indexOf(new Student("정리제", 700)) != -1) {
			System.out.println("indexOf: 있느뇨");
		} else {
			System.out.println("indexOf: 없느뇨");
		}
		
		if (list.contains(new Student("정리제", 700))) {
			System.out.println("contains: 있느뇨");
		} else {
			System.out.println("contains: 없느뇨");
		}
		
		// 객체 정렬
		// Integer, String 등의 경우 Collections.sort()를 바로 사용 가능
		// 사용자 정의 객체끼리 비교할 경우에는 불가능
		// => 어떤 값을 기준으로 정렬할지 별도로 구현해야 함 (name? age?)
		
		// 2가지 방법
		// Student 클래스가 Comparable 인터페이스를 구현하거나
		// 자바의 Comparator를 사용해서 정렬 조건을 지정
		
		// 기본 정렬 (age 오름차순)
		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s.getName() + " - " + s.getAge());
		}
	}
}
