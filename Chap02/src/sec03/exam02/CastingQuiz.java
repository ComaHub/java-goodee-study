package sec03.exam02;

import java.util.Scanner;

// Quiz
// long 타입을 입력받아 변수 number에 저장 후 number 변수의 값을 int로 변환한 결과 출력

public class CastingQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long number = scanner.nextLong();
		System.out.println((int) number);
	}
}
