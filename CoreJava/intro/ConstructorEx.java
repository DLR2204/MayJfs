package intro;

public class ConstructorEx {
	
	public ConstructorEx() {			//default constructor
		System.out.println("6.Iam from the default constructor");
	}
	
	public ConstructorEx(String name) {		//parametrized constructor
		System.out.println("10.My name is:-"+name);
	}
	
	public ConstructorEx(int value) {
		System.out.println("14.the value is:-"+value);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx(1325);//constructor calling
	}

}
