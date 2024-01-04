package com.wileyEdge.employee;

public class DoWhileLoop {
	public static void main(String[] args) {
		int n = 10;
		generateFibonacciSeries(n);
	}

	public static void generateFibonacciSeries(int n) {
		int firstTerm = 0, secondTerm = 1, count = 0;

		System.out.println("Fibonacci Series for first " + n + " numbers:");

		do {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

			count++;
		} while (count < n);
	}

}
