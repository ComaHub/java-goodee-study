package homework.homework03.model.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileDAO {
	public boolean checkName(String file) {
		File myfile = new File(file);
		return myfile.exists();
	}
	
	public void fileSave(String file, String s) {
		File myFile = new File(file);
		
		try (Writer writer = new FileWriter(myFile)) {
			myFile.createNewFile();
			writer.write(s);
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder stringBuilder = new StringBuilder();
		File myFile = new File(file);
		
		try (Reader reader = new FileReader(myFile)) {
			char[] arr = new char[1024];
			
			while (true) {
				int readCharNum = reader.read(arr);
				if (readCharNum == -1) break;
				
				for (int i = 0; i < readCharNum; i++) {
					stringBuilder.append(arr[i]);
				}
			}
		} catch (Exception e) { e.printStackTrace(); }
		
		return stringBuilder;
	}
	
	public void fileEdit(String file, String s) {
		File myFile = new File(file);
		
		try (Writer writer = new FileWriter(myFile, true)) {
			writer.write(s);
		} catch (Exception e) { e.printStackTrace(); }
	}
}
