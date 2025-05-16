package sec02.exam06;

public class WhilePrint1To10Example {
	public static void main(String[] args) {
		// 1부터 10까지 반복 출력
		int count = 1; // 초기식
		while (count <= 10) { // 조건식
			System.out.println(count++); // 증감식 (없으면 무한 루프!)
		}
	}
}
