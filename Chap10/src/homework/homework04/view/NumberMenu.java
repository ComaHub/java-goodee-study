package homework.homework04.view;

import java.util.Scanner;

import homework.homework04.controller.NumberController;
import homework.homework04.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수 1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = scanner.nextInt();
		
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
