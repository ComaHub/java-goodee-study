package sec01.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream inputStream = new FileInputStream("D:/Temp/test2.db");
		
		// 길이가 100인 byte 타입의 빈 배열 생성
		byte[] buffer = new byte[100];
		
		while (true) {
			// 입력 스트림에서 배열의 길이만큼 읽어옴
			int readByteNum = inputStream.read(buffer);
			if (readByteNum == -1) break;
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		inputStream.close();
		
		// 많은 양의 바이트를 읽을 때는 read(byte[] arr) 메서드를 사용하는 것이 좋다
		// 100개의 바이트가 입력 스트림으로 들어오면 read()는 100번을 반복해야 하지만 위 방법으로 하면 1번만 읽으면 됨
	}
}
