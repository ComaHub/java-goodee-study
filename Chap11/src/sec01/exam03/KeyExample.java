package sec01.exam03;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {
	public static void main(String[] args) {
		// Map: key/value 쌍으로 데이터를 저장하는 컬렉션 인터페이스
		// Key 객체를 식별키로 사용해 String 값을 저장하는 HashMap 객체 생성
		Map<Key, String> map = new HashMap<Key, String>();
		
		// Key 객체로 "홍길동" 저장
		map.put(new Key(1), "홍길동");
		
		// Key 객체로 "홍길동"을 가져옴
		String value = map.get(new Key(1));
		System.out.println(value); // 결과: null
		// equals() 메서드를 오버라이딩 했음에도 동등 객체로 판단하지 않음
		// get()을 할 때, hashCode() 값을 먼저 비교하고 그 다음 equals()로 비교하기 때문
		// => hashCode()도 오버라이딩 해야함
		// HashMap의 키로 String이 가장 많이 사용됨 (hashCode()와 equals()가 이미 오버라이딩 되어있음)
		// 사용자 정의 객체를 키로 사용할 경우 반드시 두 메서드를 직접 오버라이딩 해야함
		
		// 참고
		// hashCode()가 재정의된 예
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("김");
		
		// 서로 다른 객체여도 같은 해시코드를 출력함 => String만의 오버라이딩된 hashCode()를 출력하기 때문
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// 시스템이 구성한 값 그대로 출력하려면?
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}
