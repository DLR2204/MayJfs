package intro;

public class MethodEx {

	public String display() {			//return type -string ,Dynamic
		return  "Hello everyone!!!!";
	}
	
	public int add(int a,int b) {		//return type- int,Dynamic  
		return (a+b);
	}
	
	public static void displayMsg() {				//retruns -nothing,Dynamic
		System.out.println("Good Morning !!!!!!");
	}
	
	public static void main(String []args) {		//returns - nothing,Static
		
		MethodEx obj = new MethodEx();
		
		System.out.println(obj.display());	//method calling
		
		System.out.println(obj.add(2, 57)); //method calling
		
		MethodEx.displayMsg();		//method calling
		
	}
	
	
}
