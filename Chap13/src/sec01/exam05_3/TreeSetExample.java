package sec01.exam05_3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬
		// 저장한 순서를 보장하지 않음
		// "정렬된 순서"를 보장함
		Set<String> set = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>(Collections.reverseOrder()); // 정렬 설정 가능
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		treeSet.add("동");
		treeSet.add("서");
		treeSet.add("남");
		treeSet.add("북");
		System.out.println(treeSet);
	}
}
