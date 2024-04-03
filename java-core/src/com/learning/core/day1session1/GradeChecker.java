package com.learning.core.day1session1;

import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the percentage:");
			
	double percentage = scanner.nextDouble();
			
			String grade= getGrade(percentage);
			System.out.println(grade);
		scanner.close();
		
	}

	public static String getGrade(double percentage){
		if(percentage>=60) {
			return"A Grade";
		}	else if(percentage>=45) {
			return"B Grade";
		}else if(percentage>=35) {
			return"C Grade";
		}else {
			return"Fail";
		}
	}
}
