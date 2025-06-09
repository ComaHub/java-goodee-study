package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 문자 기반 파일 입력 스트림
		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		while (true) {
			String str = bufferedReader.readLine();
			if (str == null) break;
			
			System.out.println(str);
		}
	}
}
