package sec01.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		OutputStream outputStream = new FileOutputStream("D:/Temp/test3.db");
		
		// 출력할 바이트 배열
		byte[] arr = {10, 20, 30, 40, 50};
		
		// 배열의 모든 바이트를 출력
		outputStream.write(arr, 1, 3);
		
		outputStream.flush();
		outputStream.close();
		
	}
}
