package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("정윤희", 4));
		set.add(new Member("정윤희", 4));
		
		// hashCode()와 equals()를 오버라이딩하지 않으면 삭제도 안 됨
		set.remove(new Member("정윤희", 4));
		
		// 이외에도 동등 객체로 판단하는 많은 메서드들이 제대로 동작하려면 오버라이딩이 필수
		
		System.out.println("총 객체 수: " + set.size());
		for (Member member : set) {
			System.out.println(member);
		}
		
		// 요소 정렬
		// Integer, String 등은 Collections.sort() 사용 가능
		// Member같은 사용자 정의 객체는 불가능 => 정렬 기준을 어떤 값으로 할지 정해줘야 함
		// => Member 클래스가 Comparable 인터페이스를 구현해야 함
		
		set.add(new Member("정윤희", 4));
		set.add(new Member("정시로", 2));
		set.add(new Member("정리제", 700));
		
		
		List<Member> list = new ArrayList<Member>(set);
		Collections.sort(list);
		
		for (Member member : list) {
			System.out.println(member);
		}
		
		// 다시 Set으로 (순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(list);
		for (Member member : sortedSet) {
			System.out.println(member);
		}
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("정윤희", 4));
		memList.add(new Member("정시로", 2));
		memList.add(new Member("정리제", 700));
		memList.add(new Member("정리제", 700)); // 중복
		memList.add(new Member("정시로", 2)); // 중복
		
		// Quiz: 중복 제거하기
		Set<Member> memSet = new HashSet<Member>(memList);
		memList = new ArrayList<Member>(memSet);
		for (Member member : memList) {
			System.out.println(member);
		}
	}
}
