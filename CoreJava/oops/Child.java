package oops;

class GrandParent{
	
	public void displayHi() {
		System.out.println("Iam from grand parent");
	}
}

class Parent extends GrandParent{
	
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
	public static void add(int a,int b) {
		System.out.println("The sum of the integers is:- "+(a+b));
	}
	
	
	
}

public class Child extends Parent{
	
	public void displayMsg() {				//Dynamic
		System.out.println("Iam from the child class");
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.displayMsg();
		
		obj.display();
		
		add(2,5);
		
		obj.displayHi();
	}

}
