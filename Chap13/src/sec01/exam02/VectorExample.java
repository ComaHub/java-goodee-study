package sec01.exam02;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// Vector => 멀티스레드 외에는 거의 사용되지 않음
// 특히 웹 개발 시 ArrayList, HashMap 많이 사용
public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("정윤희", "발로란트", "나비"));
		list.add(new Board("정리제", "모비노기", "먀빗"));
		list.add(new Board("정타비", "마인크래프트", "떡콩"));
		
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getSubject() + " " + board.getContent() + " " + board.getWriter());
		}
	}
}
