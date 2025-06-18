package board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import board.dto.Board;
import board.service.BoardService;
import board.service.BoardServiceImpl;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static BoardService boardService = new BoardServiceImpl(); // 게시판 비즈니스 로직 객체
	private static List<Board> boardList;
	
	/**
	 * 메뉴판
	 */
	private static void menu() {
		System.out.println("========== 게시판 ==========");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 입력: ");
	}
	
	private static void list() {
		System.out.println("========== 게시글 목록 ==========");
		
		// 게시글 목록 데이터 요청
		boardList = boardService.list();
		printAll(boardList);
	}
	
	/**
	 * 글 목록 전체 출력
	 * @param boardList
	 */
	private static void printAll(List<Board> boardList) {
		// 글 목록이 존재하는지 먼저 확인
		if (boardList == null || boardList.isEmpty()) {
			System.out.println("조회된 글이 없습니다.");
			return;
		}
		
		// 글 목록 출력
		for (Board board : boardList) {
			print(board);
		}
	}

	/**
	 * 게시글 출력
	 * @param board
	 */
	private static void print(Board board) {
		if (board == null) {
			System.out.println("조회할 수 없는 게시글입니다.");
			return;
		}
		
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		LocalDateTime reg = board.getRegDate();
		LocalDateTime upd = board.getUpdDate();
		
		// 날짜 포맷: yyyy/MM/dd HH:mm:ss
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		System.out.println("========================================");
		System.out.println("★ 글 번호: " + no);
		System.out.println("★ 제목: " + title);
		System.out.println("★ 작성자: " + writer);
		System.out.println("----------------------------------------");
		System.out.println(" " + content);
		System.out.println();
		System.out.println("★ 등록일자: " + reg.format(dtf));
		System.out.println("★ 수정일자: " + upd.format(dtf));
		System.out.println("========================================");
		System.out.println();
	}
	
	/**
	 * 게시글 조회
	 */
	private static void select() {
		System.out.println("========== 게시글 조회 ==========");
		System.out.print("글 번호: ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		Board board = boardService.select(no);
		print(board);
	}
	
	/**
	 * 게시글 삭제
	 */
	private static void delete() {
		System.out.println("========== 게시글 삭제 ==========");
		System.out.print("게시글 번호: ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		int result = boardService.delete(no);
		if (result > 0) System.out.println("★ 게시글이 삭제되었습니다.");
		else System.out.println("★ 게시글 삭제에 실패했습니다.");
	}

	/**
	 * 게시글 수정
	 */
	private static void update() {
		System.out.println("========== 게시글 수정 ==========");
		System.out.print("게시글 번호: ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		Board board = input();
		board.setNo(no);
		
		int result = boardService.update(board);
		if (result > 0) System.out.println("★ 게시글이 수정되었습니다.");
		else System.out.println("★ 게시글 수정에 실패했습니다.");
	}

	/**
	 * 게시글 등록
	 */
	private static void insert() {
		System.out.println("========== 게시글 등록 ==========");
		Board board = input();
		
		// 게시글 등록 요청
		int result = boardService.insert(board);
		if (result > 0) System.out.println("★ 게시글이 등록되었습니다.");
		else System.out.println("★ 게시글 등록에 실패했습니다.");
	}
	
	/**
	 * 게시글 정보 입력
	 * @return
	 */
	private static Board input() {
		System.out.print("제목: ");
		String title = scanner.nextLine();
		
		System.out.print("작성자: ");
		String writer = scanner.nextLine();
		
		System.out.print("내용: ");
		String content = scanner.nextLine();
		
		return new Board(title, writer, content);
	}

	public static void main(String[] args) {
		int menuNo = 0;
		
		while (true) {
			// 메뉴판 출력
			menu();
			
			// 메뉴 번호 입력
			menuNo = scanner.nextInt();
			scanner.nextLine();
			
			// 0 -> 프로그램 종료
			if (menuNo == 0) break;
			
			// 메뉴 선택
			switch (menuNo) {
				case 1 -> list();
				case 2 -> select();
				case 3 -> insert();
				case 4 -> update();
				case 5 -> delete();
				default -> System.out.println("잘못 입력되었습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
