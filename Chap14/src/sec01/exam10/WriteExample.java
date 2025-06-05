package sec01.exam10;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter("D:/Temp/test10.txt");
		
		// Writer는 문자열을 좀 더 쉽게 보내기 위해 write(String str) 메서드를 제공
		String str = "안녕하시지";
		
		writer.write(str);
		// 1번 인덱스부터 2개까지의 문자열 출력
		// writer.write(str, 1, 2);
		
		writer.flush();
		writer.close();
	}
}
