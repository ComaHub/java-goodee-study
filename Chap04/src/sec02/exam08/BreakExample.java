package sec02.exam08;

public class BreakExample {
	public static void main(String[] args) {
		while (true) {  // Infinite loop => 내부에 빠져나올 break가 들어가야 함
			// 1부터 6까지 임의의 정수값
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) break; // 가장 가까운 반복문을 빠져나감
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
