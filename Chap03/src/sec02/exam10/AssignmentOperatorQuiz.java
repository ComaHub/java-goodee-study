package sec02.exam10;

//  Quiz
//  금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//  최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.

//  [입력]
//  5640

//  [출력]
//  500원:11개
//	100원:1개
//	50원:0개
//	10원:4개
//	1원:0개

import java.util.Scanner;

public class AssignmentOperatorQuiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputMoney = scanner.nextInt();
		
		int coin_500 = inputMoney / 500;
		inputMoney %= 500;
		
		int coin_100 = inputMoney / 100;
		inputMoney %= 100;
		
		int coin_50 = inputMoney / 50;
		inputMoney %= 50;
		
		int coin_10 = inputMoney / 10;
		inputMoney %= 10;
		
		System.out.println("500원: " + coin_500);
		System.out.println("100원: " + coin_100);
		System.out.println("50원: " + coin_50);
		System.out.println("10원: " + coin_10);
		System.out.println("1원: " + inputMoney);
	}
}
