package com.wileyEdge.employee;

public class SwapLetters {
	public static void main(String[] args) {
		String input = "Hello world";
		String output = replaceFirstAndLast(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String replaceFirstAndLast(String input) {
		char firstChar = input.charAt(0);
		char lastChar = input.charAt(input.length() - 1);

		StringBuilder result = new StringBuilder(input);
		result.setCharAt(0, lastChar);
		result.setCharAt(input.length() - 1, firstChar);

		return result.toString();
	}

}
