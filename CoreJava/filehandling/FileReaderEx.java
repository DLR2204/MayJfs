package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\June.txt");
	
		int i = fr.read();
				
		while(i != -1) {		
			
			i = fr.read();
			
			System.out.println((char)i);
		}
	
	System.out.println("File is read successfully");
	
	}
}
