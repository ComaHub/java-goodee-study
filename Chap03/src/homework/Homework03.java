package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("친구 수: ");
		int numberFriend = scanner.nextInt();
		
		System.out.print("사탕의 수: ");
		int amountCandy = scanner.nextInt();
		
		System.out.printf("1인당 사탕 개수: %d개\n남는 사탕 개수: %d개", amountCandy / numberFriend, amountCandy % numberFriend);
	}
}
