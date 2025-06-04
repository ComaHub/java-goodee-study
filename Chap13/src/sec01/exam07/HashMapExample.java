package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 서로 다른 객체
		// 내부 데이터가 같을 때 동등 키로 판단하려면 hashCode, equals 오버라이딩 필요
		map.put(new Student(1, "정유니"), 95);
		map.put(new Student(1, "정유니"), 100);
		
		System.out.println("총 Entry 수: " + map.size());
		
		// 오버라이딩하지 않으면 검색도 불가능
		System.out.println(map.get(new Student(1, "정유니")));
	}
}
