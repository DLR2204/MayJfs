package intro;

public class ConstructorEx1 {
	public ConstructorEx1() {				//default constru
		this("apple");
	}

	public ConstructorEx1(String name) {	// 1 parmetrized constru
		this("banana", "cat");
		System.out.println(name);
	}

	public ConstructorEx1(String name, String name1) {
		this("duck", "egg", "foam");
		System.out.println(name + "\t" + name1);
	}

	public ConstructorEx1(String name, String name1, String name2) {
		this("girl", "house", "ink", "jack");
		System.out.println(name + "\t" + name1 + "\t" + name2);
	}

	public ConstructorEx1(String name, String name1, String name2, String name3) {
		System.out.println(name + "\t" + name1 + "\t" + name2 + "\t" + name3);
	}
	
	public static void main(String[] args) {
		ConstructorEx1 obj = new ConstructorEx1();		//default constr calling
	}
}
