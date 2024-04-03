package com.learning.core.day1session1;

import java.util.Scanner;

public class BingoChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers in the range 1 to 40 seperated by space:");

		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int[] array = { 7, 25, 5, 19, 30 };

		boolean foundNumber1 = false;
		boolean foundNumber2 = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number1) {
				foundNumber1 = true;
			}
			if (array[i] == number2) {
				foundNumber2 = true;
			}
		}
		if (foundNumber1 && foundNumber2) {
			System.out.println("Bingo");
		} else {
			System.out.println("Not found");
		}
		scanner.close();
	}
}
