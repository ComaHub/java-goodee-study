package homework.homework03;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberMenu {
	private Scanner scanner = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		Master:
		while (true) {
			System.out.println("""
					===== (주)가남에 오신것을 환영합니다. =====
					원하시는 메뉴의 번호를 입력하세요.
					1. 회원가입
					2. 로그인
					3. 같은 이름 회원 찾기
					9. 종료""");
			
			System.out.print("메뉴 번호 입력: ");
			int selectMenu = scanner.nextInt();
			scanner.nextLine();
			
			switch (selectMenu) {
				case 1 -> joinMember();
				case 2 -> {
					logIn();
					memberMenu();
				}
				case 3 -> sameName();
				case 9 -> { break Master;}
				default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void memberMenu() {
		Dominant:
		while (true) {
			System.out.println("""
					***** 회원 메뉴 *****
					회원 메뉴는 회원만 접근할 수 있습니다.
					먼저 회원가입, 로그인을 해주세요.
					1. 비밀번호 바꾸기
					2. 이름 바꾸기
					3. 로그아웃""");
			
			System.out.print("메뉴 번호 입력: ");
			int selectMenu = scanner.nextInt();
			scanner.nextLine();
			
			switch (selectMenu) {
				case 1 -> changePassword();
				case 2 -> changeName();
				case 3 -> { break Dominant; }
				default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("로그아웃 되었습니다.");
	}

	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		
		while (true) {
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			
			System.out.print("이름: ");
			String name = scanner.nextLine();
			
			Member member = new Member(name, password);
			boolean result = mc.joinMember(id, member);
			
			if (result) {
				System.out.println("성공적으로 회원 가입을 완료했습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}

	public void logIn() {
		System.out.println("=== 2. 로그인 ===");
		
		while (true) {
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			
			String result = mc.logIn(id, password);
			if (result != null) {
				System.out.println(result + "님, 환영합니다!");
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 잘못되었습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changePassword() {
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		
		while (true) {
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("현재 비밀번호: ");
			String oldPassword = scanner.nextLine();
			
			System.out.print("새로운 비밀번호: ");
			String newPassword = scanner.nextLine();
			
			boolean result = mc.changePassword(id, oldPassword, newPassword);
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		
		while (true) {
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			
			String name = mc.logIn(id, password);
			if (name != null) {
				System.out.println("현재 설정된 이름: " + name);
				System.out.print("변경할 이름: ");
				String newName = scanner.nextLine();
				
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름: ");
		String name = scanner.nextLine();
		
		Map<String, String> resultMap = mc.sameName(name);
		Set<Map.Entry<String, String>> resultSet = resultMap.entrySet();
		Iterator<Map.Entry<String, String>> resultIterator = resultSet.iterator();
		while (resultIterator.hasNext()) {
			Map.Entry<String, String> entry = resultIterator.next();
			System.out.println(entry.getValue() + " - " + entry.getKey());
		}
	}
}
