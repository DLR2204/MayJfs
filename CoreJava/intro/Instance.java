package intro;

public class Instance {

	static String Nationality = "Indian";

	int Aadhar;

	public static void main(String[] args) {
		Instance ramesh = new Instance();
		Instance suresh = new Instance();
		Instance mahesh = new Instance();
		Instance rajesh = new Instance();
		Instance naresh = new Instance();
		ramesh.Aadhar=1;
		suresh.Aadhar=2;
		mahesh.Aadhar=3;
		rajesh.Aadhar=4;
		naresh.Aadhar=5;
		
		
		System.out.println("Ramesh :-"+Instance.Nationality +"     "+ramesh.Aadhar);
		System.out.println("Suresh :-"+Instance.Nationality+"     "+suresh.Aadhar);
		System.out.println("Mahesh :-"+Instance.Nationality +"     "+mahesh.Aadhar);
		System.out.println("Rajesh :-"+Instance.Nationality +"     "+rajesh.Aadhar);
		System.out.println("Naresh :-"+Instance.Nationality +"     "+naresh.Aadhar);
		
		
		
		

	}
}
