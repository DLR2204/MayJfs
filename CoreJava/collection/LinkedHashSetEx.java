package collection;

import java.util.LinkedHashSet;
//Collections:-
//growable in nature

//lots of utility methods

//similar/ disimilar objects into it.
//set:-lhs
//following insertion order
//duplicate are not allowed
public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("apple");

		lhs.add(1234);

		lhs.add("fruits");

		lhs.add(3.14f);

		lhs.add("orange");

		System.out.println(lhs);

		lhs.add("apple");

		lhs.add(1234);

		lhs.add("fruits");

		lhs.add(3.14f);

		lhs.add("orange");

		System.out.println(lhs);
	}

}
