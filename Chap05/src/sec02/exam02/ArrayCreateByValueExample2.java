package sec02.exam02;

public class ArrayCreateByValueExample2 {
	public static void main(String[] args) {
		// 2. 배열 변수 선언 후 나중에 값 대입
		int[] scores;
//		scores = {83, 90, 87}; => Error! 이 방식은 선언과 동시에 초기화할 때만 적용 가능
		scores = new int[] {83, 90, 87};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println(sum);
		
		// 배열 매개변수의 인자로 배열 객체를 만들어 넘기는 경우
		// int sum2 = add({83, 90, 87}); => Error!
		int sum2 = add(new int[] {83, 90, 87}); 
		System.out.println(sum2);
	}
	
	// 메소드 선언
	public static int add(int[] scores) { // 이미 선언된 매개변수
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
}
