package oops;

public class Child1 extends Parent1 {
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.parentMethod();
		
		Child2 obj1  = new Child2();
		
		Child3 obj2 = new Child3();
		
		obj1.displayChild2();
		
		obj2.displayChild3();
		
	}

}
