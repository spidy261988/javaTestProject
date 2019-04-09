package org.ranjit.examples;

import static org.testng.Assert.assertEquals;

import java.sql.Array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class CarTest {
	
	static final String[] MY_CAR_STATE = {"PENDING","PROCESSING","COMPLETED"};
	private final Logger Log = LoggerFactory.getLogger(CarTest.class);
	
	@Test
	public void shouldreturnNoOfhellowNewCar() {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		assertEquals(Car.carCounter(),3);
	}
	
	@Test 
	public void shouldReturnNoOfHelloNewCarLoop() {
		for(int i=1;i<=4;i++) {
			new Car();
			System.out.println("Car No " + i);
		}
		assertEquals(Car.carCounter(),4);
		
	}
	
	@Test
	public void hellowRanjit() {
		
		Car car1 = new Car();
		assertEquals(car1.hellowRanjit("Ranjit"), "Hellow Ranjit");
	}
	
	@Test
	public void booleantest() {
		
		boolean monday = false;
		boolean raining = false;
		boolean saturday = false;
		boolean sunny = false;
		
		if(monday && raining) {
			System.out.println(Car.goForLongDrive());
		}else if (saturday && sunny){
			System.out.println(Car.goForWeekendTrip());
		}
		else {
			System.out.println(Car.goToWork());
		}
	}
	
	@Test
	public void sampleArray() {
		Car[] cars = new Car[3];
		int Count = cars.length;
		for(int i=0;i<Count;i++) {
			cars[i] = new Car();
			System.out.println("New Car No: " +cars[i]);
		}
	}
	
	@Test
	public void tryStaticFinal() {
		
		for(String str : MY_CAR_STATE) {
			if(str == "PENDING") {
				System.out.println("Your Car Manufactring is Not Started Yet");
			}else if(str == "PROCESSING") {
				System.out.println("Your Car Manufactring is Under Progress");
			}else {
				System.out.println("Your Car Will be delivered");
			}
		}
	}
	
	@Test
	public void testEnum() {
		
		for(StateOfCar str :StateOfCar.values()) {
			if(str == StateOfCar.PENDING) {
				System.out.println("Your Car Manufactring is Not Started Yet");
			}
		}
	}
	
	@Test
	public void testSwitchCase() {
		
		char state = 'C';
		
		switch(state) {
		case 'C':
			Car.Completed();
			break;
		case 'P':
			System.out.println("Pending Status");
			break;
		case 'I':
			System.out.println("Processing Status");
			break;
		default:
			System.out.println("Something is wrong please try again");
			break;
		}
	}
	
	@Test
	public void testSL4jLogger() {
		
		int a=4,b=3;
		
		if(a==b) {
			Log.error("This is Error");
		}
	}
	
	@Test
	public void testMainMethod() {
		String[] str = {"BMW", "Ferrari"};
		New_Test.main(str);
	}
	
	@Test
	public void testArrayCopy() {

		int[] a = {1,2,3,4,5};
		
		/*
		int[] b = a;
		b[1]=26;
		
		for(int i : a) {
			System.out.print(i+" ");
			}
		a[0]=14;
		System.out.println();
		
		for(int i :b) {
			System.out.print(i+" ");
		}
		System.out.println(a+ " "+b);
	*/
		
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		for(int i : a) {
			System.out.print(i+" ");
			}
		b[0]=14;
		System.out.println();
		
		for(int i :b) {
			System.out.print(i+" ");
		}
		
		System.out.println(a+ " "+b);
	}

}
