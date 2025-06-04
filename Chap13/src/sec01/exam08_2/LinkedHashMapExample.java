package sec01.exam08_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// HashMap => 순서를 보장하지 않음
		
		// LinkedHashMap => 데이터를 저장한 순서를 유지함 (순서가 중요한 경우 사용)
		
		Map<String, Object> flower = new LinkedHashMap<String, Object>();
		flower.put("이름", "튤립");
		flower.put("꽃말", "고백");
		flower.put("가격", 20000);
		flower.put("개화일", 10);
		System.out.println(flower);
	}
}
