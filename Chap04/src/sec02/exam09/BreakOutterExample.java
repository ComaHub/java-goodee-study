package sec02.exam09;

public class BreakOutterExample {
	public static void main(String[] args) {
		// 중첩 for문에서 break 사용 시 => 가장 가까운 for문을 빠져나감
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) break; // break로 빠져나가도...
				
				System.out.print("i = " + i);
				System.out.println(", j = " + j);
			}
			
			// 여기로 이동함 => 바깥쪽 for문은 그대로 반복
		}
		
		System.out.println();
		
		// 이름이 붙은 반복문
		Master: 
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				
				if (lower == 'g') break Master; // Label이 지정된 for문을 빠져나감
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
