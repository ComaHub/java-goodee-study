package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호(-): ");
		char genderNum = scanner.nextLine().charAt(7);
		
		System.out.print("입력하신 주민번호는 ");
		System.out.println(genderNum == '1' || genderNum == '3' ? "남성입니다." : 
												genderNum == '2' || genderNum == '4' ? "여성입니다." : "잘못된 값입니다.");
	}
}
