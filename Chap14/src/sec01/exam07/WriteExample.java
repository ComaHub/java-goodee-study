package sec01.exam07;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter("D:/Temp/test7.txt");
		
		// 3바이트
		// char a = 'A';
		// char b = 'B';
		// char c = 'C';
		
		// 9바이트
		char a = '가';
		char b = '나';
		char c = '다';
		
		// 한 문자(2byte)씩 세 번 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}
}
