package sec01.exam13.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Quiz1 {
// Quiz
// FileReader를 사용해 output.txt 파일을 읽어와 출력하기

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Reader reader = new FileReader("D:/Temp/output.txt");
		
		char[] arr = new char[1024];
		
		int readCharNum = reader.read(arr);
		String str = new String(arr);
		System.out.println(str);
	}
}
