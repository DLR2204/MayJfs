package collection;

import java.util.Comparator;
import java.util.TreeSet;
//Collections:-
//growable in nature

//lots of utility methods

//similar/ disimilar objects into it.
//Set:-
//aphabetical order
//Duplicates are not allowed

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyOrder());
		
		ts.add("b");		//a=97 ,b =98  
		
		ts.add("e");
		
		ts.add("d");
		
		ts.add("a");
		
		ts.add("c");
		
		System.out.println(ts);
		
		
	}

}

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
}


