package org.ranjit.examples;

public class Car {
	
	public static int carCounter;
	
	public Car() {
		
		carCounter = ++carCounter;
	}
	
	public String hellowRanjit(String name) {
		return "Welcome "+name+" to Our World";
	}

	public static int carCounter() {
		return carCounter;
	}

	public String hellowRanjit() {
		return "Hellow Ranjit";
	}

	public static String goForLongDrive() {
		return "Enjoy long and beatiful drive with Puki Baby";
		
	}

	public static String goForWeekendTrip() {
		return "Go an Weekend Trip with Puki Baby";
	}

	public static String goToWork() {
		return "Go to Work and Work too much";
	}

	public static void Completed() {
		for(int i=0; i<10;i++) {
		System.out.println("Completed Method Called");
		Car car = new Car();
		System.out.println(car);
		}
	}
	
	

}
