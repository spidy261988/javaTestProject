package org.ranjit.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ListTest {
	
	@Test
	public void integerTest() {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(22);
		myList.add(38);
		myList.add(45);
		myList.add(56);
		myList.add(5);
		myList.add(70);
		myList.add(81);
		myList.add(9);
		myList.add(54);
		System.out.println("Size of the List: "+myList.size());
		
		for (Integer i : myList) {
			System.out.println("Element is: "+i);
			
		}
	}
	
	@Test
	public void iteratorTest() {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(12);
		myList.add(5);
		myList.add(10);
		myList.add(19);
		
		Iterator<Integer> a = myList.iterator();
		
		while(a.hasNext()) {
			System.out.print(a.next()+" ");
		}
	}
	
	@Test
	public void duplicateValueTest() {
		
		int myArray[] = new int[] {7,2,3,4,5,1,2,5,4,6};
		
		Arrays.sort(myArray);
		
		for(int i=0; i<myArray.length-1;i++) {
			
			if(myArray[i]==myArray[i+1]) {
				System.out.println("duplicate values are : "+ myArray[i+1]+" at location : "+(i+1));
			}
		}
		
	}

}
