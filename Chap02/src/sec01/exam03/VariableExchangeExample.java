package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		y = x; // x에 저장된 값을 y에 복사 저장
		System.out.println("x: " + x + ", y: " + y);
	}
}
