package com.wileyEdge.employee;

public class CharSelection {

	public static void main(String[] args) {
		String input = "Softra Service Limited";
		String acronym = buildAcronym(input);
		System.out.println("Input: " + input);
		System.out.println("Acronym: " + acronym);
	}

	public static String buildAcronym(String input) {
		String[] words = input.split("\\s+");
		StringBuilder acronym = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			if (i < words[i].length()) {
				char charToAdd = words[i].charAt(i);
				acronym.append(charToAdd);
			}
		}

		return acronym.toString().toUpperCase();
	}

}
