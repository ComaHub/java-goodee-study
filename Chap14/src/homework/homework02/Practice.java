package homework.homework02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Practice {
	public long method1(String path) {
		long startTime = System.nanoTime();
		
		try (InputStream inputStream = new FileInputStream(path)) {
			byte[] arr = inputStream.readAllBytes();
			String str = new String(arr, "UTF-8");
			System.out.println(str);
		} catch (Exception e) { e.printStackTrace(); }
		
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	
	public long method2(String path) {
		long startTime = System.nanoTime();
		
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path))) {
			byte[] arr = bufferedInputStream.readAllBytes();
			String str = new String(arr, "UTF-8");
			System.out.println(str);
		} catch (Exception e) { e.printStackTrace(); }
		
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
