package collection;

import java.util.TreeMap;

public class MapEx {
	
	public static void main(String[] args) {
		TreeMap  tm = new TreeMap();
		
		tm.put(101,"orange");
		
		tm.put(100,"apple");
		
		tm.put(103,true);
		
		tm.put(102,"tulips");
		
		
		
		System.out.println(tm.get(103));
		
	}

}
