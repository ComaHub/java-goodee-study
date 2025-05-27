package sec01.exam08;

public class SystemTimeExample {
	public static void main(String[] args) {
		// 1부터 100만까지의 합을 구하는 데 걸리는 시간 측정
		long startTime = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("1 ~ 100만까지의 합: " + sum);
		System.out.println("걸린 시간: " + (endTime - startTime));
		
		// 주로 실행 시간(성능) 측정할 때 사용
	}
}
