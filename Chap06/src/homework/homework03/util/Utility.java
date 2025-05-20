package homework.homework03.util;

public class Utility {
	public String addString(String str1, String str2) {
		return str1 + str2;
	}
	
	public int multiply(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		
		return num1 * num2;
	}
	
	public boolean isEqual(String str1, String str2) {
		return str1.equals(str2);
	}
}
