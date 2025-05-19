package sec02.exam10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		
		System.out.println("sum = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("avg = " + avg);
		
	  // 정리: 기본 for보다 간결해 자주 사용 but index 값을 사용해야 하는 경우 기본 for를 사용
	}
}
