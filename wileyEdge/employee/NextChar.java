package com.wileyEdge.employee;

public class NextChar {
	public static void main(String[] args) {
		String input = "hello java";
		String output = getNextCharacters(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String getNextCharacters(String input) {
		StringBuilder result = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				char nextChar = (char) (c + 1);
				result.append(nextChar);
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

}
