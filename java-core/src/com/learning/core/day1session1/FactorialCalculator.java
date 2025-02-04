package com.learning.core.day1session1;

import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of to find factorial:");

		int number = scanner.nextInt();
		int factorial = calculateFactorial(number);

		System.out.println("Factorial of " + number + " is " + factorial);
		scanner.close();
	}

	public static int calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		}
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
