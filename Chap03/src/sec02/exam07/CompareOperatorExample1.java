package sec02.exam07;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A'; // 유니코드 65 저장
		char char2 = 'B'; // 유니코드 66 저장
		boolean result4 = (char1 < char2); // 65 < 66, 유니코드 값으로 비교
		System.out.println("result4=" + result4);
	}
}
