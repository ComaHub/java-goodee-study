package sec02.exam04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		// 잘못 작성된 for
		for (float i = 0.1F; i <= 1.0F; i += 0.1F) {
			System.out.println(i); // 10번 반복하도록 작성해도 실제로는 9번 반복 => 증감식에서 정확히 0.1이 아닌 0.1의 근사값이 더해짐
		}
		// 초기화식에 사용되는 변수는 정수 타입을 쓰도록 하자
	}
}
