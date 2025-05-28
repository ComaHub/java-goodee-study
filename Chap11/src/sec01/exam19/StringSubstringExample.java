package sec01.exam19;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "050205-4267719";
		
		String firstNum = ssn.substring(0, 6);
		String lastNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(lastNum);
	}
}
