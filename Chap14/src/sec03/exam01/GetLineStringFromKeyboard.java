package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in; // 바이트 기반 입력 스트림
		Reader reader = new InputStreamReader(inputStream); // 문자 기반인 Reader로 변환
		BufferedReader bufferedReader = new BufferedReader(reader); // readLine()을 지원하는 보조 스트림 연결
		
		while (true) {
			System.out.print("입력하세요: ");
			String str = bufferedReader.readLine();
			
			if ("Q".equalsIgnoreCase(str) || "Quit".equalsIgnoreCase(str)) break;
			System.out.println("입력된 내용: " + str);
		}
		
		bufferedReader.close();
	}
}
