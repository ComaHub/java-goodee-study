package sec02.exam07;

//  Quiz: 1부터 100까지 홀수의 합

public class WhileSum1To100Quiz {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		
		while (count <= 100) {
			sum += count;
			count += 2;
		}
		
		System.out.println(sum);
	}
}
