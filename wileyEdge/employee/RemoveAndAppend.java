package com.wileyEdge.employee;

public class RemoveAndAppend {

	public static void main(String[] args) {
		String input = "abcxXXcxerxxXXwer";
		String result = removeAndAppend(input);
		System.out.println(result);

	}

	private static String removeAndAppend(String input) {
		StringBuilder withoutx = new StringBuilder();
		StringBuilder xAtEnd = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (c == 'x') {
				xAtEnd.append(c);
			} else {
				withoutx.append(c);
			}
		}
		return withoutx.toString() + xAtEnd.toString();
	}

}
