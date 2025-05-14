package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine(); // Scanner에서 읽은 한 라인 전체 (\n을 만날 때까지)
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
			if (inputData.equals("End")) break;
		}
		
		System.out.println("장비를 정지합니다.");
	}
}
