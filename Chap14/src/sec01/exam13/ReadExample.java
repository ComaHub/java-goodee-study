package sec01.exam13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader reader = new FileReader("D:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		// 입력 스트림에서 3개의 문자를 읽고 index 2부터 저장
		int readCharNum = reader.read(buffer, 2, 3);
		if (readCharNum != -1) { // 읽은 문자가 있으면
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}
}
