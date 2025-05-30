package homework.homework01;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		Master:
		while (true) {
			System.out.print("""
					=== 가남 도서관에 오신걸 환영합니다 ===
					원하시는 업무의 번호를 선택하세요.
					1. 새 도서 추가
					2. 도서 전체 조회
					3. 도서 검색 조회
					4. 도서 삭제
					5. 도서 오름차순 정렬
					9. 종료
					""");
			
			System.out.print("메뉴 선택: ");
			int selectMenu = sc.nextInt();
			sc.nextLine();
			
			switch (selectMenu) {
				case 1 -> insertBook();
				case 2 -> selectList();
				case 3 -> searchBook();
				case 4 -> deleteBook();
				case 5 -> ascBook();
				case 9 -> { break Master; }
				default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		
		System.out.print("도서명: ");
		String title = sc.nextLine();
		
		System.out.print("저자명: ");
		String author = sc.nextLine();
		
		System.out.print("장르: ");
		int category = sc.nextInt();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		String bookCategory = 
		switch (category) {
			case 1 -> "인문";
			case 2 -> "자연과학";
			case 3 -> "어린이";
			default -> "기타";
		};
		
		Book book = new Book(title, author, bookCategory, price);
		bc.insertBook(book);
	}
	
	public void selectList() {
		System.out.println("=== 전체 조회 ===");
		List<Book> bookList = bc.selectList();
		
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book book : bookList) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		
		System.out.print("검색어: ");
		String keyword = sc.nextLine();
		
		List<Book> searchList = bc.searchBook(keyword);
		
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book book : searchList) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("=== 도서 삭제 ===");
		
		System.out.print("도서명: ");
		String title = sc.nextLine();
		
		System.out.print("저자명: ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if (remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	
	public void ascBook() {
		if (bc.ascBook() == 1) System.out.println("정렬에 성공했습니다.");
		else System.out.println("정렬에 실패했습니다.");
	}
}
