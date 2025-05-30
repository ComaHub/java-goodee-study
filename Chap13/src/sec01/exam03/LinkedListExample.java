package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList는 일부 특별한 경우를 제외하면 거의 사용되지 않음
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간: " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간: " + (endTime - startTime) + "ns");
	}
}
