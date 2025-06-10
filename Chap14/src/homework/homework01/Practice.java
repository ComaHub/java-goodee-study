package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Practice {
	public void method1(String song) {
		try (OutputStream outputStream = new FileOutputStream("D:/test/sub/나비야1.dat")) {
			byte[] arr = song.getBytes("UTF-8");
			outputStream.write(arr);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	public void method2(String song) {
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/test/sub/나비야2.dat"))) {
			byte[] arr = song.getBytes("UTF-8");
			bufferedOutputStream.write(arr);
		} catch (Exception e) { e.printStackTrace(); }
	}
}
