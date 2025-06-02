package sec01.exam05_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		// HashSet
		// 요소를 추가한 순서를 보장하지 않음
		// 빠른 요소 추가, 삭제, 검색
		Set<String> set = new HashSet<String>();
		
		// LinkedHashSet
		// 요소를 추가한 순서대로 저장됨
		// HashSet에 비해 메모리를 많이 먹고 처리 시간이 길다
		Set<String> linkedSet = new LinkedHashSet<String>();
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		linkedSet.add("동");
		linkedSet.add("서");
		linkedSet.add("남");
		linkedSet.add("북");
		System.out.println(linkedSet);
	}
}
