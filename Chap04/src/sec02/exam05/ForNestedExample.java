package sec02.exam05;

public class ForNestedExample {
	public static void main(String[] args) {
		// 늘 있는 구구단 (중첩 for)
		for (int i = 2; i <= 9; i++) {
			System.out.println("**** " + i + "단 ****");
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
			}
			
			System.out.println();
		}
		
		// (참고) for문 중첩 시 퍼포먼스가 떨어짐 => 가능하면 2중까지만 하자
	}
}
