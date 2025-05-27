package homework.homework03.view;

import java.util.Scanner;

import homework.homework03.controller.CharacterController;
import homework.homework03.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		System.out.print("문자열: ");
		String line = scanner.nextLine();
		
		try {
			int result = cc.countAlpha(line);
			System.out.println("'" + line + "'에 포함된 영문자 개수: " + result);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
