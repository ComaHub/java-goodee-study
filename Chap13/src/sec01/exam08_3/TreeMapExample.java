package sec01.exam08_3;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// TreeMap => 키를 기준으로 자동 정렬 (기본: 오름차순)
		
		Map<String, Object> flower = new TreeMap<String, Object>();
		flower.put("이름", "장미");
		flower.put("꽃말", "응원");
		flower.put("가격", 10000);
		flower.put("개화일", 12);
		System.out.println(flower);
		
		// 내림차순
		flower = new TreeMap<String, Object>(Collections.reverseOrder());
		flower.put("이름", "장미");
		flower.put("꽃말", "응원");
		flower.put("가격", 10000);
		flower.put("개화일", 12);
		System.out.println(flower);
	}
}
