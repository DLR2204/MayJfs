package oops;



class Parent8{
	public void marriage() {
		System.out.println("The marriage is with Kajol");
	}
	
	public void display() {
		System.out.println("Im from the parent class");
	}
	
	public void assets() {
		System.out.println("You can take 10000 Cr property");
	}
}

public class Child7 extends Parent8{
	
	
	@Override
	public void marriage() {
		System.out.println("The marriage is with DEEPIKA");
	}
	
	public static void main(String[] args) {
		
		Child7 obj = new Child7();
		
		obj.assets();
		
		obj.display();
		
		obj.marriage();
	}

}
