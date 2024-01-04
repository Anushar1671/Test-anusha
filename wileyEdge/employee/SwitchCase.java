package com.wileyEdge.employee;

public class SwitchCase {

	public static void main(String[] args) {
		String input = "Hello Java";
		findAndPrintVowels(input);
	}

	public static void findAndPrintVowels(String input) {
		for (char c : input.toCharArray()) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':

				System.out.print(c + " ");
				break;
			}
		}
	}
}
