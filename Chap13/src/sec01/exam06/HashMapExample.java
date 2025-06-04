package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 특징
		// 키-값 쌍으로 데이터 저장
		// 키는 중복불가, 값은 중복 가능
		// 순서보장 여부는 구현체에 따라 다름
		
		// HashMap
		// 가장 많이 쓰이는 일반적 
	  // 키를 기반으로 hashCode()를 계산해 위치를 정함
		// 순서 보장 안됨
		
		// Map의 컬렉션 생성
		// 키 타입으로 보통 String, Integer(Long)을 많이 씀
		// 이유 => Hashcode와 Equal이 이미 오버라이딩 되어있음
		Map<String, Integer> map = new HashMap<String, Integer>(); // 오른쪽 제네릭은 생략 가능
		
		// 객체 저장
		// put()은 내부에 키가 이미 존재하는지 확인하고
		// 존재하지 않으면 새로 추가한 후 null 반환
		// 존재하면 값을 덮어쓰고, 덮어쓰기 전의 값을 반환
		map.put("정유니", 5);
		map.put("정칸나", 1000);
		map.put("정리제", 700);
		map.put("정유니", 4); // 키가 같으면 기존의 값을 덮어씌움
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		// Key값으로 Value를 검색
		// 찾지 못하면 null 반환
		System.out.println("정칸나: " + map.get("정칸나"));
		
		// 객체를 하나씩 처리
		// Iterator(반복자): 컬렉션 내부의 요소를 하나씩 순회할 수 있도록 도와줌
		// Iterator를 쓰려면 해당 객체가 Iterable 인터페이스를 구현하고 있어야 함
		// Collection을 구현한 클래스들(ArrayList, HashSet 등)은 전부 Iterable 인터페이스를 구현하고 있음 (Collection이 Iterable을 상속받기 때문에)
		// 하지만 Map은 Collection을 구현한 클래스가 아니라서 Iterable을 구현하고 있지 않음 => 해결법: Map의 구성요소를 Set으로 바꾸자!
		
		// 1. keySet() 이용: Key만 Set으로 변환 => Set<K> 반환 (Key만 모은 Set이 필요할 때 사용)
		System.out.println("[Iterator 사용]");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		// Quiz: 향상된 for문으로 객체를 하나씩 처리
		System.out.println("[Enhanced for 사용]");
		for (String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		}
		
		// 2. entrySet() 이용: Entry를 Set으로 변환 => Set<Map.Entry<String, Integer>> 반환
		// 키와 값을 함께 보존한 Set이 필요할 때 사용
		System.out.println("[Iterator-EntrySet 사용]");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			// 반복해서 Map.Entry를 얻고 내부의 Getter로 Key와 Value를 획득
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		// Quiz: 향상된 for문으로 객체를 하나씩 처리 => 읽기 전용으로 순회할 경우 이 방식을 더 선호함
		System.out.println("[Enhanced for-EntrySet 사용]");
		for (Map.Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// 정리: Iterator가 필요한 상황(for-each보다 유리한 경우)
		// 읽기 전용이면 for-each가 가장 깔끔하고 실용적
		// 수정, 삭제, 조건 제어 등 복잡한 순회가 필요하면 Iterator가 더 유리			
		// Iterator는 반복 중 컬렉션의 구조 변경을 감지 가능
		// 예: 순회 중 요소를 안전하게 제거할 때
		// Iterator.remove()는 ConcurrentModificationException 없이 안전하게 삭제 가능
		// 반면 for-each에서 map.remove()를 쓰면 오류 발생 가능
		
		// 객체 검색
		// HashMap은 Key와 Value를 가지고 있음
		// Key와 Value를 기준으로 특정 값의 포함 여부를 판단할 수 있음
		
		// containsKey()
		// 특정 키가 있는지 확인
		String keyToCheck = "정유니";
		if (map.containsKey(keyToCheck)) {
			System.out.println("HashMap에 " + keyToCheck + "가 존재합니다.");
		} else {
			System.out.println("HashMap에 " + keyToCheck + "가 존재하지 않습니다.");
		}
		
		// containsValue()
		// 특정 값이 있는지 확인
		// 특정 값의 키가 여러개면 첫 번째로 발견되는 즉시 true 반환
		Integer valueToCheck = 700;
		if (map.containsValue(valueToCheck)) {
			System.out.println("HashMap에 " + valueToCheck + "살인 사람이 존재합니다.");
		} else {
			System.out.println("HashMap에 " + valueToCheck + "살인 사람이 존재하지 않습니다.");
		}
		
		// 객체 삭제
		map.remove("정유니");
		System.out.println("총 Entry 수: " + map.size());
		
		// 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
