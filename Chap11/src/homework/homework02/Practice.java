package homework.homework02;

class Practice {
	String takeState(String str) {
		String[] strArr = str.split(" ");
		for (String s : strArr) {
			if (s.charAt(s.length() - 1) == '구') return s;
		}
		
		return null;
	}
}
