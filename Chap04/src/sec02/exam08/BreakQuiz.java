package sec02.exam08;

// Quiz: 1 ~ n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 n과 합을 출력하는 프로그램 구현

public class BreakQuiz {
	public static void main(String[] args) {
		
		int sum = 0;
	  int count = 1;
		
		while (true) {
			sum += count++;
			if (sum > 1000) break;
		}
		
		System.out.printf("%d까지의 합: %d", --count, sum);
	}
}
