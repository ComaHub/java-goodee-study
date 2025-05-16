package sec02.exam03;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ " + --i + " 합: " + sum);
		
		// (참고) 무한 루프
		int count = 0;
		for (; true; ) {
			count++;
			System.out.println("무한 반복");
			// 용례: 특정 조건을 만족하면 중단
			if (count == 6) {
				break;
			}
		}
	}
}
