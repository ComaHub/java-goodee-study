package sec01.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// HashSet은 특정 상황에서만 사용됨
// 중복 데이터 제거에 유용
public class HashSetExample {
	public static void main(String[] args) {
		// Set 특징 = 수학의 집합과 비슷
		// 순서없는 데이터 저장 (순서가 있어보여도 다른 요인에 인한 것)
		// 동일한 요소를 중복저장할 수 없음
		// 하나의 null만 저장할 수 있음
		// 중복 판단 기준: hashcode()로 위치를 찾고, equals()로 동등성
		
		Set<String> set = new HashSet<String>();

		// 객체 추가}
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("iBATIS");
		
		// Set 출력
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		System.out.println("총 객체 수: " + set.size());
		
		// Iterator(반복자)로 모든 객체를 하나씩 가져오기
		// 컬렉션의 요소를 순회할 수 있도록 도와주는 인터페이스
		// HashSet처럼 순서가 없는 컬렉션 내부의 요소를 순차적으로 접근할 수 있도록 도와줌
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { // 가져올 요소가 있는지 확인 (있으면 true)
			String str = iterator.next(); // 객체 1개를 가져옴 => 커서는 첫 요소 이전 위치에 있음 / next() 호출 시 커서가 다음 위치로 이동하면서 그 요소를 반환
			System.out.println(str);
		}
		
		// 객체 삭제
		// set은 index가 없기 때문에 hashCode()와 equals()로 판단
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수: " + set.size());
		
		// 향상된 for문으로 모든 객체 하나씩 가져오기
		// set은 순서(index)가 없으므로 일반 for문은 사용 불가 (get()도 사용 불가) 
	  for (String str : set) {
			System.out.println(str);
		}
	  
	  // 모든 객체를 제거하고 비움
	  set.clear();
	  
	  if (set.isEmpty()) {
	  	System.out.println("set이 비어있습니다.");
	  }
	  
	  // HashSet과 집합
	  // 수학의 집합 구조를 효율적으로 처리하기에 적합함
	  // 두 집합의 합집합, 교집합, 차집합 연산이 가능
	  Set<Integer> mySet = new HashSet<Integer>();
	  mySet.add(1);
	  mySet.add(2);
	  mySet.add(3);
	  
	  Set<Integer> yourSet = new HashSet<Integer>();
	  yourSet.add(2);
	  yourSet.add(3);
	  yourSet.add(4);
	  
	  // 합집합
	  // 두 개의 HashSet을 하나로 합침
	  // 공통으로 포함된 데이터는 하나로 통일
	  // mySet.addAll(yourSet);
	  // System.out.println("합집합: " + mySet);
	  
	  // 교집합
	  // 2개의 HashSet에서 공통된 요소만 추려줌
	  // mySet.retainAll(yourSet);
	  // System.out.println("교집합: " + mySet);
	  
	  // 차집합
	  // 기준 HashSet에서 대상 Hashset과의 교집합 제외
	  mySet.removeAll(yourSet);
	  System.out.println("차집합: " + mySet);
	  
	  // 주의! 위 3개 메소드는 모두 기준이 되는 원본의 데이터를 바꿈 (새 HashSet을 반환하는 것이 아님!)
	  // 새 HastSet으로 얻으려면 원본의 복제를 만들어서 사용하자
	  
	  
	  // 요소 정렬
	  // HashSet은 순서가 없기 때문에 정렬하려면 다른 컬렉션으로 변환해야 함
	  // List로 변환 후 Collections.sort() 사용
	  Set<String> fruits = new HashSet<String>();
	  fruits.add("Banana");
	  fruits.add("Apple");
	  fruits.add("Orange");
	  System.out.println(fruits);
	  
	  // Set -> List
	  List<String> fruitsList = new ArrayList<String>(fruits);
	  
	  // 정렬
	  Collections.sort(fruitsList);
	  System.out.println(fruitsList);
	  
	  // 필요하면 정렬된 순서를 유지하는 Set으로 다시 만들기
	  Set<String> sortedSet = new LinkedHashSet<String>(fruitsList);
	  System.out.println(sortedSet);
	  
	  // ArrayList의 요소에서 중복 제거 => Set으로 한번 다녀오면 됨
	  List<String> list = new ArrayList<String>();
	  list.add("Java");
	  list.add("Spring");
	  list.add("Java"); // 중복 요소
	  list.add("JDBC");
	  
	  // HastSet으로 중복 제거

	}
}