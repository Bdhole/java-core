package com.learning.core.day1session1;

import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number of rows:");
	
int numRows = scanner.nextInt();
for(int i=1;i<=numRows;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i);
	}
	System.out.println();
}
scanner.close();
}
}
