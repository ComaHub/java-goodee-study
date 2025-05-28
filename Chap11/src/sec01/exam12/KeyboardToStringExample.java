package sec01.exam12;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		// byte 배열에 키보드에서 읽어온 keycode를 저장
		System.out.print("입력: ");
		int numReadByte = System.in.read(bytes); // input stream에서 byte를 여러 개 읽어 배열에 저장 => 읽은 바이트 수를 반환
		
		System.out.println(numReadByte);
		// 참고
		// 예: Hello 엔터를 치면 바이트 배열에 H e l l o \r \n 을 저장하고 7을 반환함
		// 엔터를 누르면 입력되는 \r과 \n이 포함되서 5가 아닌 7을 반환
		
		String str = new String(bytes, 0, numReadByte - 2);
		System.out.println(str);
		
		// 추가 실습
		// Scanner 객체 사용
		// System.in.read()는 keycode를 하나씩 읽는 것이 단점 => 단점을 보완하기 위해 Scanner 클래스 제공
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("입력 2: ");
		// String str2 = scanner.nextLine(); // 입력한 문자열을 \n까지 읽고 \r 이전까지 전체 반환
		// System.out.println(str2);
		
		// 참고: try-with-resources
		// 리소스를 자동으로 닫아주는 try 문법 
		// close를 명시하지 않아도 try가 끝나거나 예외 발생 즉시 자원ㅓ
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print("입력 3: ");
			String str3 = scanner.nextLine();
			System.out.println(str3);
		} 
		
	}
}
