package sec01.exam09;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Writer writer = new FileWriter("D:/Temp/test9.txt");
		
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(arr, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
