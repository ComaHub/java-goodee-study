package sec01.exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream inputStream = new FileInputStream("D:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		// 입력 스트림으로부터 3바이트를 읽고 index 2부터 순차적으로 저장
		int readByteNum = inputStream.read(buffer, 2, 3);
		
		if (readByteNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		inputStream.close();
	}
}
