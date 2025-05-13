package sec01.exam01;

public class VariableInitExample {
	public static void main(String[] args) {
//		int value;
//		int result = value + 10; => Compile error / 초기화하지 않은 변수는 메모리에 생성되지 않아 값을 읽을 수 없음
//		초기화: 변수에 처음으로 값을 저장하는 것
		
		int value = 30;
		int result = value + 10;
		System.out.println(result);
	}
}
