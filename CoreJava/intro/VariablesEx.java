package intro;

public class VariablesEx {
	
	static int value = 43;	//global static varibale
	
	int number = 23;		//global instance variable
	
	
	
	public static void main(String[] args) {
		
		int value = 25;		//local variable
		
		System.out.println(value);
		
		System.out.println(VariablesEx.value);
		
		VariablesEx obj = new VariablesEx();	//object creation
		
		System.out.println(obj.number);
		
		
		
	}
	
	


}
