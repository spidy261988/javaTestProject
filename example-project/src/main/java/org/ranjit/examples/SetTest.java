package org.ranjit.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetTest {

	@Test
	public void integerHashSet() {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(10);
		mySet.add(22);
		mySet.add(38);
		mySet.add(45);
		mySet.add(56);
		mySet.add(5);
		mySet.add(70);
		mySet.add(81);
		mySet.add(9);
		mySet.add(54);
		System.out.println("Size of the Set : "+mySet.size());
		
		for(Integer i : mySet) {
			System.out.println("Element is: "+i);
			
		}
	}
	
	@Test
	public void integerTreeSet() {
		
		Set<Integer> mySet = new TreeSet<>();
		
		mySet.add(10);
		mySet.add(22);
		mySet.add(38);
		mySet.add(45);
		mySet.add(56);
		mySet.add(5);
		mySet.add(70);
		mySet.add(81);
		mySet.add(9);
		mySet.add(54);
		System.out.println("Size of the Set : "+mySet.size());
		
		for(Integer i : mySet) {
			System.out.println("Element is: "+i);
			
		}
	}
	
	@Test
	public void stringTreeTest() {
		
		Set<String> mySet = new TreeSet<>();
		
		mySet.add("Ranjit");
		mySet.add("Sudeshna");
		mySet.add("Zuku");
		mySet.add("Puki");
		
		for(String s: mySet) {
			System.out.println(s);
		}
	}
	
	@Test
	public void duplicateTest() {
		
		Set<String> mySet = new HashSet<>();
		List<String> myList = new ArrayList<>();
		
		myList.add("Ranjit");
		myList.add("Sudeshna");
		myList.add("Puku");
		myList.add("Puki");
		myList.add("Ranjit");
		
		for(String name : myList) {
			
			if(mySet.add(name)==false) {
				System.out.println("This is Duplicate value: "+name);
			}else {
			System.out.println("Name Added : "+name);
			}
		}
		System.out.println("List Length: "+myList.size());
		System.out.println("Set Length: "+mySet.size());
		
	}
	

}
