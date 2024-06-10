package intro;

import java.util.Date;

public class MethodEx1 {
	
	
	
	public static void displayMsg(String name) {		//static
		
		System.out.println("Hello Welcome "+name);
	}
	
	public void date() {
		Date date = new Date();			//object creation
		
		System.out.println(date);
		
		displayMsg("Java");
		
	}
	
	public static void main(String[] args) {
		
		MethodEx1 obj = new MethodEx1();
		
		obj.date();
		
		
		
	}

}
