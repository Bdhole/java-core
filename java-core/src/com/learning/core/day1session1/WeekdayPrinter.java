package com.learning.core.day1session1;

import java.util.Scanner;

public class WeekdayPrinter {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7:");
		
int weekNumber = scanner.nextInt();
		
		if(weekNumber>=1&& weekNumber<=7) {
			String weekName = getWeekName(weekNumber);
	System.out.println(weekName);
	}
	else {
	System.out.println("Invalid Input");
	}
	scanner.close();
	
}

public static String getWeekName(int weekNumber){
	String[]weekNames= {
			"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
			};
	return weekNames[weekNumber-1];
}
}

