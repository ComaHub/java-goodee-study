package sec01.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List의 특징
		// 순서 유지, 중복 허용
		
		// 인터페이스 타입 사용 => 다형성을 사용하기 위해
		// 다른 구현 클래스를 사용하더라도 코드 수정 없이 새 기능 추가 가능
		
		// 제네릭: 클래스나 메소드가 사용할 타입을 외부에서 정할 수 있게 하는 기능
		// 타입 파라미터: 제네릭을 사용할 때 전달하는 타입
		List<String> list = new ArrayList<String>(); // 제네릭을 생략하면 Object로 간주함 (권장 X)
		
		// 객체 추가
		// list.add(true) => Error! 제네릭에 명시한 타입 데이터만 추가 가능
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // => index 2에 삽입 (뒤로 하나씩 밀려남)
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		System.out.println("총 객체 수: " + list.size());
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		// 리스트 출력하기
		System.out.println(list); // 오버라이딩한 toString() 호출
		System.out.println();
		
		// 객체 수정
		// 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
		list.set(4,  "MyBatis");
		System.out.println(list);
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("MyBatis");
		
		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		for (String s : list) {
			System.out.println(s);
		}
		
		// (참고) forEach (람다식)
		// 함수형 프로그래밍: 함수를 값처럼 사용하는 프로그래밍 방식
		list.forEach(item -> {
			System.out.println(item);
		});
		System.out.println();
		
		// 객체 검색
		if (!list.isEmpty()) { // 비어있는지 조사
			System.out.println("JDBC가 존재하는가? " + list.contains("JDBC"));
			System.out.println("어디에 있나? " + list.indexOf("JDBC"));
			System.out.println("Database가 존재하는가? " + list.contains("Database"));
			System.out.println("어디에 있나? " + list.indexOf("Database"));
		}
		System.out.println();
		
		// 저장된 모든 객체 삭제
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("총 객체 수: " + list.size());
		
		// 요소 정렬
		List<String> strList = new ArrayList<String>();
		strList.add("나");
		strList.add("가");
		strList.add("사");
		strList.add("하");
		strList.add("마");
		System.out.println(strList);
		
		// 오름차순
		Collections.sort(strList);
		System.out.println(strList);
		
		// 내림차순
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		System.out.println();
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(11);
		numList.add(5);
		numList.add(1);
		numList.add(9);
		numList.add(3);
		System.out.println(numList);
		
		Collections.sort(numList);
		System.out.println(numList);
		
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);
	}
}
