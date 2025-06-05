package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 입출력 스트림
// 물과 같이 데이터가 흘러가는 것
// Java에서는 스트림을 통해 파일, 네트워크, 키보드, 메모리 등에서 데이터를 주고받을 수 있음
// 입력 스트림: 외부 -> 프로그램으로 들어오는 데이터 읽기
// 출력 스트림: 프로그램 -> 외부로 나가는 데이터 쓰기

// 스트림의 종류
// 구분		바이트 기반 스트림 (1 byte)  	문자 기반 스트림(2 byte = char)
// 입력		InputStream										Reader
// 출력 	OutputSteam										Writer
public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 데이터 도착지를 test1.db 파일로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("D:/Temp/test1.db"); // 바이트를 파일에 출력해 저장하는 기능
		
		// 출력할 바이트 (0 ~ 255)
		// 값의 범위를 넘어가면 오버플로우, 언더플로우 발생
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 출력 스트림을 이용해 출력하는 메서드
		// 1byte씩 3번 출력
		os.write(a); // write는 int형을 받지만 byte가 int에 들어가고 write는 int의 4byte 중 제일 끝의 1byte만 잘라서 출력함
		os.write(b);
		os.write(c);
		// write를 한다고 바로 데이터가 출력 스트림을 통해 흘러가는 것이 아님!
		// 임시 저장 공간인 버퍼에 데이터가 쌓이고, 어느정도 쌓이면 한꺼번에 출력
		// 버퍼: 워터 슬라이드 튜브
		// 출력 스트림: 워터 슬라이드 물줄기
		
		// 반드시 write() 후 마지막에 flush() 수행
		os.flush(); // 버퍼를 비움 (쌓여있을 수 있는 데이터를 전부 출력하고 청소)
		
		// 참고: 모든 출력 스트림이 다 버퍼를 갖고 있는 것은 아님!
		// FileOutputStream에는 내부 버퍼가 존재하지 않음 => write시 곧바고 OS에 전달되어 출력
		// 이 경우 flush()가 필수는 아니지만, 그래도 명시적으로 호출하는 것이 안전
		
		// 더 이상 쓰지 않는 경우 출력 스트림 닫기
		os.close(); // 출력 스트림이 사용했던 자원을 풀어줌
		// close() 안에서도 닫기 전에 flush를 해줌
		
		// 참고: try-with-resources
		// close()를 호출하지 않아도 try 블록이 끝나거나 예외 발생 시 리소스를 자동으로 닫아줌
		// AutoCloseable 인터페이스를 구현한 클래스만 사용 가능
		//try (OutputStream os2 = new FileOutputStream("D:/Temp/test2.db")) {
		//	os2.write(a);
		//	os2.write(b);
		//	os2.write(c);
		//} catch (Exception e) { e.printStackTrace(); }
		
		// 참고: binary 파일, 데이터란?
		// 0과 1로 이루어진 이진 데이터
		// 컴퓨터 내부의 모든 데이터는 0과 1로 처리되지만 우리가 다루는 데이터는 크게 두 종류 => 텍스트 데이터 / 바이너리 데이터
		// Text Data: 사람이 읽을 수 있는 문자 중심의 데이터("Hello world!")
		// Binary Data: 사람은 읽을 수 없는 이진 형식의 데이터(이미지, 동영상, 음악 등 텍스트가 아닌 모든 데이터)
	}
}
