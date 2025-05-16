package sec02.exam01;

public class ArrayCreateByValueExample {
	public static void main(String[] args) {
		// 값 목록을 이용해 배열 생성
		// 1. 배열 변수 선언과 동시에 값 대입
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
		
		// 반복문을 이용한 합계 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = sum / 3.0;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
