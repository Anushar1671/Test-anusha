package com.wileyEdge.employee;

public class ExtractInitial {

	public static void main(String[] args) {
		String input = "Softra Service Limited";
		String initials = extractInitials(input);
		System.out.println(initials);

	}

	private static String extractInitials(String input) {
		StringBuilder initials = new StringBuilder();
		for (String word : input.split("\\s+")) {
			initials.append(word.charAt(0));
		}
		return initials.toString();
	}

}
