package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		// long (8 byte)
		
		long var1 = 10;
		long var2 = 20L; // L을 붙이거나 안 붙이거나 문제 없음
//		long var3 = 20000000000; // Java compiler는 정수 literal을 기본적으로 int로 간주 => 200억이 int 범위를 넘기 때문에 compile error 발생
		long var4 = 20000000000L; // compiler에게 long 타입의 숫자임을 알려줘야 함 => L을 붙여서 명시
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var4 = " + var4);
		
	}
}
