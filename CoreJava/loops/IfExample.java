package loops;

import java.util.Scanner;

public class IfExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your age :-");	
		
		byte age = scan.nextByte();
		
		if(age>=18) {
			System.out.println("You can go to voting");
		}
		
		else {
			System.out.println("You are not allowed to vote");
		}
		
	}

}
