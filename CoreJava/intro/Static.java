package intro;

public class Static {
	
	static int staticcounter;		//static global variable
	
	int instancecounter;			//instance global variable
	
	public void counter() {
		staticcounter++;		 
		instancecounter++;
	}
	
	public void display() {
		System.out.println("StaticCounter :-" +staticcounter);
		System.out.println("InstanceCounter:- "+instancecounter);
	}
	
	public static void main(String[] args) {
		
		Static obj1 = new Static();				//object creation
		
		Static obj2 = new Static();
		
		Static obj3 = new Static();
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		
		
		obj3.display();
		
		
		
	}

}
