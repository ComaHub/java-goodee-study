package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStringExample {
	// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 기본 스트림은 바이트 기반이지만 직접 사용하지 않고 각각 Writer와 Reader로 변환해서 사용
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		write("문자 변환 스트림을 사용합니다.");
		System.out.println(read());
		
	}
	
	public static void write(String str) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("D:/Temp/test1.txt");
		// 문자열을 바이트 배열로 만든 다음 출력해도 되지만
		// 여기서는 보조 스트림을 연결해 자동 변환
		Writer writer = new OutputStreamWriter(fos); // 문자 기반 출력 보조 스트림을 연결
		
	  writer.write(str); // 문자열을 바로 쓸 수 있음 (UTF-8)
	  
	  writer.flush();
	  writer.close();
	}
	
	public static String read() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("D:/Temp/test1.txt"); // 바이트 기반 파일 입력 스트림
		// 바이트를 읽어 문자열로 변환해 사용해도 되지만
		// 여기서는 보조 스트림을 연결해 바이트 -> 문자로 자동 변환
		Reader reader = new InputStreamReader(fis); // 문자 기반 입력 보조 스트림 연결
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		
		String data = new String(buffer, 0, readCharNum);
		
		reader.close();
		return data;
	}
}
