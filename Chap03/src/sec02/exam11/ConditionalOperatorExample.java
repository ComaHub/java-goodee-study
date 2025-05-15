package sec02.exam11;

public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C') ;
		System.out.printf("%d점은 %s등급입니다.\n", score, grade);
	}
}
