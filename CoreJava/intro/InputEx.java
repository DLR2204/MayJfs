package intro;

import java.util.Scanner;

public class InputEx {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);	//scanner class object
		
		System.out.print("Please enter your name:-");
		
		String name = scan.next();
		
		System.out.println("Welcome "+name);
		
		
		
		
	}

}
