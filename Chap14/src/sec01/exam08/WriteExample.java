package sec01.exam08;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter("D:/Temp/test8.txt");
		
		char[] arr = {'A', 'B', 'C'};
		
		writer.write(arr);
		
		writer.flush();
		writer.close();
	}
}
