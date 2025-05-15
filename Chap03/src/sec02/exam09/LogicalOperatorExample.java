package sec02.exam09;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; // 65
		System.out.println(charCode);
		
		if ((charCode >= 65) & (charCode <= 90)) { // true & true => true
			System.out.println("대문자 이군요");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) { // false && 판별 X => false (short-circuit)
			System.out.println("소문자 이군요");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) { // true && false => false
			System.out.println("숫자 이군요");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) { // true | true => true
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) { // true || 판별 X => true (short-circuit)
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		// 정리: 연산의 결과는 같지만 효율성이 더 높으므로 &&, || 을 권장
	}
}
