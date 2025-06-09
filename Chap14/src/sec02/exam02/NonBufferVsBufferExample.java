package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
	static int data = -1; // 입력 스트림에서 데이터가 전혀 들어오지 않는 경우를 위해 초기화
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 참고: 클래스명.class = 해당 클래스의 class 객체를 가리키는 문법
		// 해당 클래스에 대한 메타 데이터를 담고 있는 유일 객체
		
		// 기본 스트림 활용
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "D:/Temp/targetFile1.jpg";
		
		long nonBufferTime = copy(new FileInputStream(originalFilePath1), new FileOutputStream(targetFilePath1));
		
		
		// 버퍼 보조 스트림 활용
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "D:/Temp/targetFile2.jpg";
		
		long bufferTime = copy(new BufferedInputStream(new FileInputStream(originalFilePath2)), new BufferedOutputStream(new FileOutputStream(targetFilePath2)));
		
		System.out.println("버퍼를 사용하지 않았을 때: " + nonBufferTime + "ns");
		System.out.println("버퍼를 사용했을 때: " + bufferTime + "ns");
		
		
	}
	
	// 입력 스트림에서 데이터를 읽고 출력 스트림으로 데이터를 보내는 코드 (데이터 복사)
	// 모든 종류의 파일을 복사하기 위해 바이트 기반 스트림 사용
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		
		while (true) {
			data = is.read(); // 바이트를 읽어서
			if (data == -1) break;
			os.write(data); // 그대로 출력
		}
		
		os.flush();
		
		is.close();
		os.close();
		// 보조 스트림만 close() 해도 내부의 기본 스트림까지 자동으로 닫힘
		// try-with-resources 패턴을 사용하는 것이 제일 좋다
		
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
