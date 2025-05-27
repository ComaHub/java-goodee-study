package homework.homework03.controller;

import homework.homework03.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				count++;
			} else if (s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			} else continue;
		}
		
		return count;
	}
}
