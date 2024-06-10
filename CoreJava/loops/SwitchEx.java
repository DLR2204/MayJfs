package loops;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your obtained marks:- ");
		
		float om = scan.nextFloat();
		
		System.out.print("Please enter your max marks:- ");
		
		float mm = scan.nextFloat();
		
		float percentage = ((om/mm)*100);
		
		System.out.println("Your percentage is :-" +percentage);
		
		int gpa = (int) (percentage/10);
		
		System.out.println("Your gpa is :-"+gpa);
		
		System.out.print("Your grade is:-");
		
		switch(gpa) {
		
		case 10:{
			System.out.println("outstanding");
			break;
		}
		case 9:{
			System.out.println("excellent");
			break;
		}
		case 8:{
			System.out.println("verygood");
			break;
		}
		case 7:{
			System.out.println("good");
			break;
		}
		
		case 6:{
			System.out.println("average");
			break;
		}
		case 5:{
			System.out.println("improvewell");
			break;
		}
		case 4:{
			System.out.println("very poor");
			break;
		}
		default:{
			System.out.println("Fail");
			break;
		}
		
		}
		
		
		
	}

}
