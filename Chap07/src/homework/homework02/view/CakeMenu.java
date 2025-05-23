package homework.homework02.view;

import java.util.Scanner;

import homework.homework02.controller.ChocolateController;
import homework.homework02.controller.GreenTeaController;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while (true) {
			System.out.print("""
					===== 어떤 케이크를 만드시겠습니까? =====
					1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)
					2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)
					9. 취소
					메뉴 번호 : """);
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch (selectNum) {
				case 1 -> chocolateMenu();
				case 2 -> greenTeaMenu();
				
				case 9 -> {
					System.out.println("종료합니다.");
					return;
				}
				
				default -> System.out.println("잘못된 번호입니다.");
			}
		}
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루 (g): ");
		double inputFlour = sc.nextDouble();
		
		System.out.print("크림 (g): ");
		double inputCream = sc.nextDouble();
		
		System.out.print("체리 (개): ");
		int inputCherry = sc.nextInt();
		
		System.out.print("초콜릿 칩 (개): ");
		int inputChip = sc.nextInt();
		
		System.out.println(cc.bakeChocolateCake(inputFlour, inputCream, inputCherry, inputChip));
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루 (g): ");
		double inputFlour = sc.nextDouble();
		
		System.out.print("크림 (g): ");
		double inputCream = sc.nextDouble();
		
		System.out.print("녹차 파우더 (g): ");
		double inputPowder = sc.nextDouble();
		
		System.out.print("치즈 큐브 (개): ");
		int inputCheese = sc.nextInt();
		
		System.out.println(gtc.bakeGreenTeaCake(inputFlour, inputCream, inputPowder, inputCheese));
	}
}
