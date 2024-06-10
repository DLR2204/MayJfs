package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\June.txt");
		
		BufferedWriter obj = new BufferedWriter(file);
		
		obj.write(1234);
		
		obj.newLine();
		
		obj.write("good \n morning");
		
		obj.newLine();
		
		char ch[] = {'a','f'};
		
		obj.write(ch);
		
		obj.flush();
		
		obj.close();
		
		System.out.println("Data is inserted successfully");
	}
//it is not accepting the boolean/float dt's
	
	//it is not reading the integer values
}
