package homework.homework02.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import homework.homework02.controller.LotteryController;
import homework.homework02.model.vo.Lottery;

public class LotteryMenu {
	private Scanner scanner = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		Master:
		while (true) {
			System.out.println("""
					===== 로또 번호 추첨 =====
					원하시는 메뉴의 번호를 입력하세요.
					1. 추첨 대상 추가
					2. 추첨 대상 삭제
					3. 추첨 대상 목록 조회
					4. 당첨 대상 구성
					5. 정렬된 당첨 대상 확인
					6. 당첨 대상 검색
					9. 종료""");
			
			System.out.print("메뉴 번호: ");
			int selectMenu = scanner.nextInt();
			scanner.nextLine();
			
			switch (selectMenu) {
				case 1 -> insertMenu();
				case 2 -> deleteMenu();
				case 3 -> searchMenu();
				case 4 -> winObject();
				case 5 -> sortedWinObject();
				case 6 -> searchWinner();
				case 9 -> { break Master; }
				default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void insertMenu() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수: ");
		int inputNum = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < inputNum; i++) {
			System.out.print("이름: ");
			String name = scanner.nextLine();
			
			System.out.print("휴대폰 번호 (- 빼고): ");
			String phone = scanner.nextLine();
			
			boolean result = lc.insertObject(new Lottery(name, phone));
			if (!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		
		System.out.println(inputNum + "명 추가 완료되었습니다.");
	}
	
	public void deleteMenu() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 휴대폰 번호를 입력하세요.");
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("휴대폰 번호 (- 빼고): ");
		String phone = scanner.nextLine();
		
		if (lc.deleteObject(new Lottery(name, phone))) System.out.println("삭제 완료되었습니다.");
		else System.out.println("삭제할 대상을 찾을 수 없습니다.");
	}
	
	public void searchMenu() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		Set<Lottery> set = lc.winObject();
		
		if (set == null) System.out.println("추첨 대상이 4명 이상이어야 당첨 대상을 구성할 수 있습니다.");
		else System.out.println(set);
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Iterator<Lottery> iterator = lc.sortedWinObject().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 휴대폰 번호를 입력하세요.");
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("휴대폰 번호 (- 빼고): ");
		String phone = scanner.nextLine();
		
		if (lc.searchWinner(new Lottery(name, phone))) System.out.println("축하합니다! 당첨 목록에 존재합니다.");
		else System.out.println("다음 기회에!");
	}
}
