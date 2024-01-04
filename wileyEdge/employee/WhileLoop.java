package com.wileyEdge.employee;

public class WhileLoop {
	public static void main(String[] args) {
		int number = 1221;
		boolean isPalindrome = checkPalindrome(number);

		if (isPalindrome) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	public static boolean checkPalindrome(int n) {
		int originalNumber = n;
		int reversedNumber = 0;

		while (n > 0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n = n / 10;
		}

		return originalNumber == reversedNumber;
	}
}
