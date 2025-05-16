package sec02.exam03;

//  Quiz2: 숫자를 입력받아 입력받은 수가 
//  짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//  홀수인 경우: 1부터 해당 숫자까지 홀수의 합을 구하는 프로그램 구현
//
//  [입력]  [출력]
//  10  => 30
//  11  => 36

import java.util.Scanner;

public class ForSumFrom1To100Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = scanner.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= inputNum; i++) {
			if (i % 2 == 0) evenSum += i;
			else oddSum += i;
		}
		
		if (inputNum % 2 == 0) System.out.println(evenSum);
		else System.out.println(oddSum);
	}
}
