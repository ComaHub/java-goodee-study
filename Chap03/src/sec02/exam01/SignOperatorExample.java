package sec02.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
//	byte result3 = -b;  // Error! (int 이하 정수의 산술 연산 결과는 int)
		int result3 = -b;
		System.out.println(result3);
	}
}
