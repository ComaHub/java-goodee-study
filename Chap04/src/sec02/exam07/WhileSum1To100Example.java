package sec02.exam07;

public class WhileSum1To100Example {
	public static void main(String[] args) {
		// 1부터 100까지의 합
		
		int count = 1;
		int sum = 0;
		while (count <= 100) {
			sum += count++;
		}
		
		System.out.printf("1부터 %d까지의 합: %d\n", --count, sum);
		
		// (참고) 무한 루프
		while (true) {
			System.out.println("무한 반복");
			
			// 용례: 특정 조건을 만족하면 멈추도록 설정 
			if (true) break;
			
			// 여기 코드는 실행 안 됨
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			
			if (true) flag = false;
			
			// 여기 코드는 실행됨
		}
		
		// 1부터 100까지의 합
		// do-while문으로 작성
		sum = 0;
		count = 1;
		
		do { // 조건 확인 전 일단 한 번은 실행
			sum += count++;
		} while (count <= 100);
		
		System.out.println(sum);
	}
}
