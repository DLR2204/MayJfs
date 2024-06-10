package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\June.txt");
	
		pw.println(1234);
		
		pw.println(true);
		
		pw.println(3.14f);
		
		pw.println("good \n morning");
		
		char []ch = {'a','b','c'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("data is written into the file successfully");
	
	}

}
