package org.ranjit.examples;

import java.util.Scanner;

public class DateDifference {

	public static void main(String[] args) {

		int dateDiff = 0, monthDiff = 0, yearDiff = 0;

		// Taking From and To date input from user
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter From Date in DD-MM-YYYY Format");
		String fromDate = in.nextLine();
		System.out.println("Please enter To Date in DD-MM-YYYY Format");
		String toDate = in.nextLine();

		// Convert String input to Integer
		int fromDateInt = 0, fromMonthInt = 0, fromYearInt = 0;
		int toDateInt = 0, toMonthInt = 0, toYearInt = 0;
		// from date array to int
		String[] fromDateArray = fromDate.split("-");
		int fromDateIntArray[] = new int[fromDateArray.length];
		for (int i = 0; i < fromDateArray.length; i++) {
			fromDateIntArray[i] = Integer.parseInt(fromDateArray[i]);

			fromDateInt = fromDateIntArray[0];
			fromMonthInt = fromDateIntArray[1];
			fromYearInt = fromDateIntArray[2];
		}
		// to date array to int
		String[] toDateArray = toDate.split("-");
		int toDateIntArray[] = new int[toDateArray.length];
		for (int i = 0; i < toDateArray.length; i++) {
			toDateIntArray[i] = Integer.parseInt(toDateArray[i]);

			toDateInt = toDateIntArray[0];
			toMonthInt = toDateIntArray[1];
			toYearInt = toDateIntArray[2];
		}

		// Compare two Dates when both dates are same
		if (fromYearInt == toYearInt & fromMonthInt == toMonthInt & fromDateInt == toDateInt) {
			dateDiff = toDateInt - fromDateInt;

		}
		// Compare two Dates when Year, Month are same
		if (fromYearInt == toYearInt & fromMonthInt == toMonthInt & fromDateInt != toDateInt) {
			dateDiff = toDateInt - fromDateInt;
		}
		// Compare two Dates When Year is same
		if (fromYearInt == toYearInt & fromMonthInt != toMonthInt & fromDateInt != toDateInt) {
			monthDiff = toMonthInt - fromMonthInt;

			if (fromMonthInt == 01 | fromMonthInt == 03 | fromMonthInt == 05 | fromMonthInt == 07 | fromMonthInt == 8
					| fromMonthInt == 10 | fromMonthInt == 12) {
				if (monthDiff <= 1) {
					int fromDateDiff = 31 - fromDateInt;
					dateDiff = fromDateDiff + toDateInt;
				} else {
					// int fromDateDiff = 31-fromDateInt;
					// dateDiff = fromDateDiff+toDateInt;
					System.out.println("Month Difference is more than 1 month: Calculation is Still IN PROGRESS");
				}
			} else if (fromMonthInt == 04 | fromMonthInt == 06 | fromMonthInt == 9 | fromMonthInt == 11) {
				if (monthDiff <= 1) {
					int fromDateDiff = 30 - fromDateInt;
					dateDiff = fromDateDiff + toDateInt;
				} else {
					// int fromDateDiff = 30-fromDateInt;
					// dateDiff = fromDateDiff+toDateInt;
					System.out.println("Month Difference is more than 1 month: Calculation is Still IN PROGRESS");
				}

			} else {
				if (monthDiff <= 1) {
					int fromDateDiff = 28 - fromDateInt;
					dateDiff = fromDateDiff + toDateInt;
				} else {
					// int fromDateDiff = 20-fromDateInt;
					// dateDiff = fromDateDiff+toDateInt;
					System.out.println("Month Difference is more than 1 month : Calculation is Still IN PROGRESS");
				}
			}

		}else {
			System.out.println("Differt Year Calculation is Still IN PROGRESS");
		}

		System.out.println(dateDiff);
	}

}
