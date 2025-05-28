package homework.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String inputName = scanner.nextLine();
		
		System.out.print("생년월일: ");
		String inputBirth = scanner.nextLine();
		
		String lastName = inputName.charAt(0) + "";
		String birthYear = inputBirth.substring(0, 4);
		String birthMonth = inputBirth.substring(4, 6);
		
		String result = lastName + birthYear.substring(2) + inputBirth.substring(6) + inputName.substring(1);
		System.out.println("암호: " + result);
	}
}
