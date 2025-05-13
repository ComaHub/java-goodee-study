package sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// float (4 byte), double (8 byte)
		// 부동소수점: 가수 * 10의 지수 제곱으로 저장 => 같은 크기를 갖는 int, long보다 더 큰 수 저장 가능
		
//	float var1 = 3.14; // Java compiler는 실수 literal을 기본적으로 double로 해석함
		// double 타입을 float 타입에 바로 넣을 수 없음
		// F를 붙여 float 타입임을 명시해야 함
		
		float var1 = 3.14F;
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		// 정밀도
		float var3 = 0.1234567890123456789F;
		double var4 = 0.1234567890123456789;
		
		System.out.println(var3);
		System.out.println(var4);
		
		// e 사용시
		double var5 = 3E6;
//	int var6 = 3E6; E가 포함된 경우 실수 리터럴
		float var6 = 3E6F;
		double var7 = 2E-3;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
	}
}
