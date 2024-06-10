package collection;

import java.util.ArrayList;
import java.util.Iterator;
//Collections:-
//growable in nature

//lots of utility methods

//List:-
//It allows duplicates
//Insertion order is preserved

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Hello");

		al.add("may");

		al.add("orange");

		al.add("parrot");

		al.add("cake");
		
		al.add( "Rakesh");
		
		al.add( "Sai");
		
		System.out.println(al);
		
//		for(String value:al) {
//			
//			System.out.println(value);
//		}
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		


		
		
	}

}
