package com.wileyEdge.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Separation {
	public static void main(String[] args) {
		String input = "computer";
		String output = parseString(input);
		System.out.println(output);

	}

	private static String parseString(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			output.append(input.charAt(i)).append("-");
		}
		return output.substring(0, output.length() - 1);
	}

}
