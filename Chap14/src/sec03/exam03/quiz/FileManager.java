package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if (dir.exists() && dir.isDirectory()) {
			File[] contents = dir.listFiles();
			for (File file : contents) {
				if (file.delete()) System.out.println(file + " -> 삭제 완료");
				else System.out.println(file + " -> 삭제 안됨");
			}
		} else System.out.println("폴더가 아니거나 존재하지 않는 폴더입니다.");
	}
}
