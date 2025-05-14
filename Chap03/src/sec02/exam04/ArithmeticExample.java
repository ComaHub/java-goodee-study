package sec02.exam04;

public class ArithmeticExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 주로 배수를 확인할 때 사용
		// 예) 3의 배수 확인 => 9 % 3 == 0 이 나오면 3의 배수
		
		// 정확한 나누기 결과값을 얻으려면 애초에 double 변수로 선언하던가 아니면 타입변환을 통해 가능
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);
	}
}
