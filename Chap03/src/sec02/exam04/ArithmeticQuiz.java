package sec02.exam04;

//Quiz
//화면에서 2자리 정수를 입력받아 10의 자리 미만을 버리고 출력하는 프로그램 구현
//
//[입력]  [출력]
//55  =>  50
//60  =>  60

import java.util.Scanner;

public class ArithmeticQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		System.out.println(number - (number % 10));
	}
}
