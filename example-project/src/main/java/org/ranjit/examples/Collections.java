package org.ranjit.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	private final static int initial_capacity = 5;
	
	public static void main(String[] args) {
		
		
		//ArrayList Testing
		List<String> r1 = new ArrayList<>(initial_capacity);
		
		r1.add("Ranjit");
		r1.add("Sudeshna");
		r1.add("Brownie");
		
		System.out.println("Size of ArrayList: "+r1.size());
		System.out.println("ArrayList: "+r1);
		System.out.println("Is ArrayList Empty: "+r1.isEmpty());
		
		//for each loop
		for(String str : r1) {
			System.out.println("Element in the ArraList: "+str);
		}
		
		r1.remove(2);
		
		System.out.println("Element in the ArraList after Removed in index 2: "+r1);
		
		r1.add(0, "Puki");
		
		System.out.println("Element in the ArraList after Adding in index 0: "+r1);
		
		r1.get(2);
		
		
		//Iterator	
		/*
		Iterator itr = r1.iterator();
		
		while(itr.hasNext()) {
			Object str = itr.next();
			System.out.print(str+ " ");
		}
		*/
		
	}

}
