package sec03.exam03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// File Class
// 파일 및 폴더 생성과 삭제
// 파일 및 폴더의 정보(이름, 경로, 크기, 최종 수정일 등) 확인
public class FileExample {
	public static void main(String[] args) {
		// 경로 구분자
		// Windows:	\(역슬래시) + 호환 및 편의를 위해 슬래시도 지원 (자동 변환)
		// Unix/Linux/MacOS: /(슬래시)
		
		// 자바는 별개로 File, Path 등 경로 관련 클래스 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		
		// 파일 객체 생성
		// 생성자에 상대 경로(프로젝트 루트 기준) 또는 절대 경로 작성
		// 파일 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아님
		// 문자열 경로에 실제 파일 또는 폴더가 없더라도 예외가 발생하지 않음
		File dir = new File("D:/Temp/images");
	  File file1 = new File("D:/Temp/file1.txt");
	  File file2 = new File("D:/Temp/file2.txt");
	  File file3 = new File("D:\\Temp\\file3.txt"); // 문자열에서는 \\로 이스케이프 필요
	  
	  // 해당 경로에 실제 파일 또는 폴더가 존재하는지 검사
	  // 존재하지 않으면 생성
	  // 폴더 생성
	  if (!dir.exists()) dir.mkdir();
	  
	  // 파일 생성
	  
		try {
			if (!file1.exists()) file1.createNewFile();
			if (!file2.exists()) file2.createNewFile();
			if (!file3.exists()) file3.createNewFile();
		} catch (IOException e) { System.out.println("파일 생성 중 오류 발생"); e.printStackTrace(); }
	  
		// 폴더 생성 2가지 방법 차이점
		// mkdir() vs mkdirs() <- 주로 사용
		File dirTest = new File("D:/Temp/test/videos");
		// if (!dirTest.exists()) dirTest.mkdir(); 경로상 맨 뒤 폴더만 생성 (상위 폴더는 이미 존재해야 함)
		if (!dirTest.exists()) dirTest.mkdirs(); // 경로에 없는 모든 폴더를 생성
		
		// 폴더 삭제
		// 폴더가 비어있어야 삭제 가능
		dirTest = new File("D:/Temp/test/videos");
		if (dirTest.delete()) System.out.println("삭제 성공");
		
		dirTest = new File("D:/Temp/test");
		if (dirTest.delete()) System.out.println("삭제 성공");
		
		// 파일 삭제
		if (file3.delete()) System.out.println("file3.txt 삭제 완료");
		
		// 파일 및 폴더 유형 확인
		// 파일인지 폴더인지의 여부를 true/false로 반환
		System.out.println("폴더? " + dir.isDirectory());
		System.out.println("파일? " + dir.isFile());
		
		System.out.println("폴더? " + file1.isDirectory());
		System.out.println("파일? " + file1.isFile());
		
		// 상위 폴더 확인
		// 파일이나 폴더가 속한 상위 폴더의 경로를 문자열로 반환
		System.out.println(dir.getParent());
		
		// 상위 폴더를 File 객체로 반환
		File parentDir = dir.getParentFile();
		
		// 전체 경로 확인
		System.out.println(dir.getPath());
		System.out.println(file1.getPath());
		
		// Temp 폴더 정보 출력
		File temp = new File("D:/Temp");
		
		if (temp.exists() && temp.isDirectory()) {
			// Temp 폴더의 파일 및 하위 경로를 File 배열로 반환
			File[] contents = temp.listFiles();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm");
			
			System.out.println("시간\t\t\t형태\t\t크기\t이름");
			System.out.println("----------------------------------------------------");
			
			// 반복문을 사용해 모든 파일 및 폴더 확인
			for (File file : contents) {
				// 파일의 마지막 수정 시간 확인 (밀리초 반환)
				// 날짜 형식으로 바꾸기 위해 SimpleDateFormat 사용
				System.out.print(sdf.format(new Date(file.lastModified())));
				
				// Time API 사용 시
				// long -> Instant -> ZonedDateTime(LocalDateTime)
				// ZonedDateTime zdt = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()); // Epoch 밀리초 -> Instant로 변경 -> atZone(시스템 시간대 정보)
				// System.out.println(" " + zdt.format(dtf));
				
				// 폴더인지 검사
				if (file.isDirectory()) System.out.println("\t<DIR>\t\t\t" + file.getName()); // 폴더일 경우 이름만 출력
				else System.out.println("\t\t\t" + file.length() + "\t" + file.getName()); // 파일일 경우 크기 + 이름 출력 (크기는 바이트 단위)
			}
		} else System.out.println("폴더가 아니거나 존재하지 않는 폴더입니다.");
		
	}
}
