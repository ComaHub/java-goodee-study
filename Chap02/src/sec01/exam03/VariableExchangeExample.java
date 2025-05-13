package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
//		y = x; // x에 저장된 값을 y에 복사 저장
//		System.out.println("x: " + x + ", y: " + y);
		
		// x와 y의 값을 서로 교환하고 싶다면
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}
}
