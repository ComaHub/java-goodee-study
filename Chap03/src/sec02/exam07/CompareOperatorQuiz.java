package sec02.exam07;

//  Quiz
//  두개의 숫자를 입력받아
//  앞의 수가 크거나 같은 경우 true를
//  뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
//
//  [입력]   [출력]
//  1 2 => false
//  10 5 => true

import java.util.Scanner;

public class CompareOperatorQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(scanner.nextInt() >= scanner.nextInt() ? "true" : "false");
	}
}
