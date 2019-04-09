package org.ranjit.examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifferenceupdated {

	public static void main(String[] args) {
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter From Date in DD MM YYYY Format");
		String fromDate = in.nextLine();
		System.out.println("Please enter To Date in DD MM YYYY Format");
		String toDate = in.nextLine();
		
		try {
		       Date dateBefore = myFormat.parse(fromDate);
		       Date dateAfter = myFormat.parse(toDate);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	}

}
