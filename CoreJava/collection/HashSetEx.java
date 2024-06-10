package collection;

import java.util.HashSet;
//Collections:-
//growable in nature

//lots of utility methods

//similar/ disimilar objects into it.
//set:-hs
//Duplicates are not allowed
//Insertion order is not preseved -it's own order

public class HashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(1234);

		hs.add("Apple");

		hs.add("mango");

		hs.add(true);

		hs.add(3.14f);

		

		hs.add(1234);

		hs.add("Apple");

		hs.add("mango");

		hs.add(true);

		hs.add(3.14f);
		
		System.out.println(hs);


	}

}
