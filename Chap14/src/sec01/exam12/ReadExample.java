package sec01.exam12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader reader = new FileReader("D:/Temp/test8.txt");
		
		//길이가 100인 char 배열 생성
		char[] buffer = new char[100];
		
		while (true) {
			// 입력 스트림으로부터 배열의 길이만큼 읽어옴
			 int readCharNum = reader.read(buffer);
			 if (readCharNum == -1) break;
			 
			 // 읽은 문자 수만큼 반복하면서 문자 출력
			 for (int i = 0; i < readCharNum; i++) {
				 System.out.println((char) buffer[i]);
			 }
		}
		
		reader.close();
		
	// 많은 양의 문자를 읽을 때는 read(char[] arr) 메서드를 사용하는 것이 좋다
	// 100개의 문자가 입력 스트림으로 들어오면 read()는 100번을 반복해야 하지만 위 방법으로 하면 1번만 읽으면 됨
	}
}
