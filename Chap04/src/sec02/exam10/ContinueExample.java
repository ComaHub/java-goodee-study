package sec02.exam10;

public class ContinueExample {
	public static void main(String[] args) {
		// 짝수만 출력하기
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) continue; // 홀수이면 다음 반복으로 건너뜀
			
			System.out.println(i);
		}
	}
}
