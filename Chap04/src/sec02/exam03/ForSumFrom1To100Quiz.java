package sec02.exam03;

// Quiz: 1부터 100까지의 짝수의 합

public class ForSumFrom1To100Quiz {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
