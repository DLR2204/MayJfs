package exceptions;

import java.io.FileNotFoundException;

public class Throw {

	public static void valid(int age) throws FileNotFoundException {
		
		if(age<18) {
			
			throw new FileNotFoundException();
		}
		else 
			System.out.println("You can go to voting");
		
	}
	
	public static void main(String[] args) {
		try {
		valid(12);}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
