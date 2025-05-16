package sec01.exam02;

public class NullExample {
	public static void main(String[] args) {
		String hobby = null;
//		System.out.println(hobby.length()); => NP Error! (객체가 없음)
		
		hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "유니";
		name = null; // 참조 끊기
		
		// "유니" 객체의 모든 참조가 끊기면 => GC가 해당 객체를 간헐적으로 메모리에서 청소해줌
	}
}
