package sec01.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 데이터 출발지를 test1.db 파일로 하는 바이트 기반 파일 입력 스트림 생성
		InputStream inputStream = new FileInputStream("D:/Temp/test1.db");
		
		while (true) {
			// 입력 스트림에서 1byte씩 읽어와 반환
			int data = inputStream.read();
			if (data == -1) break; // 읽어올 것이 없을 경우 
			System.out.println(data);
		}
		
		inputStream.close();
	}
}
