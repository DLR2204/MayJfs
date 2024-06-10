package oops;

interface Parent2 {

	public void add(int a, int b) ;

}

interface Parent3 {

	public void add(int a, int b) ;
}

public class Child4 implements Parent2,Parent3{

	@Override
	public void add(int a, int b) {
		
		System.out.println("The sum of 2 values is :-" +(a+b));
	}
	
	
	public static void main(String[] args) {
		
		Child4 obj = new Child4();
		
		obj.add(3, 6);
		
	}
	

}
