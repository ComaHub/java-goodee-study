package sec01.exam11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	// 데이터 출발지를 test7.txt 파일로 하는 문자 기반 파일 입력 스트림 생성
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader reader = new FileReader("D:/Temp/test7.txt"); // 파일에서 문자 데이터를 읽는 기능
		
		while (true) {
			// 입력 스트림에서 한 문자(2byte)씩 읽어오고 int(4byte)로 반환
			int data = reader.read();
			if (data == -1) break;
			
			System.out.println((char) data);
			
			// read() 메서드가 반환한 int값을 char로 캐스팅하면 읽은 문자를 얻을 수 있음
		}
		
		reader.close();
	}
}
