package homework.homework03.view;

import java.io.File;
import java.util.Scanner;

import homework.homework03.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		Master:
		while (true) {
			System.out.println("""
					***** My Note ***** 
					1. 노트 새로 만들기 
					2. 노트 열기 
					3. 노트 열어서 수정하기 
					9. 끝내기 """);
			
			System.out.print("메뉴 번호: ");
			int selectMenu = sc.nextInt();
			sc.nextLine();
			
			switch (selectMenu) {
				case 1 -> fileSave();
				case 2 -> fileOpen();
				case 3 -> fileEdit();
				case 9 -> { break Master; }
				default -> System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void fileSave() {
		StringBuilder stringBuilder = new StringBuilder();
		
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용: ");
			String input = sc.nextLine();
			
			if ("ex끝it".equals(input)) break;
			stringBuilder.append(input + "\n");
		}
		
		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요. (ex. myFile.txt): ");
			String fileName = sc.nextLine();
			
			File file = new File("D:/test/sub/" + fileName);
			if (file.exists()) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (Y/N): ");
				String inputSelect = sc.nextLine();
				
				if ("Y".equals(inputSelect)) {
					fc.fileSave("D:/test/sub/" + fileName, stringBuilder);
					break;
				} else continue;
			} else {
				fc.fileSave("D:/test/sub/" + fileName, stringBuilder);
				break;
			}
		}
	}

	public void fileOpen() {
		System.out.print("열 파일 명: ");
		String inputNote = sc.nextLine();
		
		boolean check = fc.checkName("D:/test/sub/" + inputNote);
		if (check) {
			System.out.println(fc.fileOpen("D:/test/sub/" + inputNote));
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명: ");
		String inputNote = sc.nextLine();
		
		boolean check = fc.checkName("D:/test/sub/" + inputNote);
		if (check) {
			StringBuilder stringBuilder = new StringBuilder();
			
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용: ");
				String input = sc.nextLine();
				
				if ("ex끝it".equals(input)) break;
				stringBuilder.append(input + "\n");
			}
			
			fc.fileEdit("D:/test/sub/" + inputNote, stringBuilder);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
}
