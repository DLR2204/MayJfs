package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\July.txt");
		
		fw.write(1234);
		
		fw.write("good \n morning");
		
		char ch[] = {'a','b','c','d'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Data is written into the file successfully");
		
	}
//filewriter will not accept boolean,float value
	
	//filewriter will not read integer values
	
	//it is not accepting new line
}
