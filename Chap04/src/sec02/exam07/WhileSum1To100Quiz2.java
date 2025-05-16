package sec02.exam07;

//	Quiz2
//	화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램 구현

//	[입력]    [출력]
//	123   =>  6
//	12345 =>  15

import java.util.Scanner;

public class WhileSum1To100Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int inputNum = scanner.nextInt();
		
		while (inputNum != 0) {
			sum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(sum);
	}
}
