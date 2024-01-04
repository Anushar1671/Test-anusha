package com.wileyEdge.employee;

public class SubString {

	public static void main(String[] args) {
		String input = "hi how are you";
		String maxLengthSubstring = findMaxLengthSubstring(input);
		System.out.println("Input: " + input);
		System.out.println("Max Length Substring: " + maxLengthSubstring);
	}

	public static String findMaxLengthSubstring(String input) {
		String[] words = input.split("\\s+");
		String maxLengthSubstring = "";

		for (String word : words) {
			if (word.length() > maxLengthSubstring.length()) {
				maxLengthSubstring = word;
			}
		}

		return maxLengthSubstring;
	}
}
