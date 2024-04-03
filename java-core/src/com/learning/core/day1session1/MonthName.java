package com.learning.core.day1session1;

import java.util.Scanner;

public class MonthName {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 12:");
		int monthNumber = scanner.nextInt();
		
		if(monthNumber>=1&& monthNumber<=12) {
			String monthName = getMonthName(monthNumber);
	System.out.println(monthName);
	}
	else {
	System.out.println("Invalid Input");
	}
	scanner.close();
	
}

public static String getMonthName(int monthNumber){
	String[]monthNames= {
			"January","February","March","April","May","June","July","Agust","September","October","November","December"
			};
	return monthNames[monthNumber-1];
}
}
