package com.wileyEdge.employee;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int number = 10;
		long factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is: " + factorial);
	}

	public static long calculateFactorial(int n) {
		if (n < 0) {
			System.out.println("Invalid input. Factorial is not defined for negative numbers.");
			return -1;
		}

		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;
	}
}
