package com.java8.interviewString;

import java.util.Scanner;

public class FibonacciCalculator {

	public static void main(String[] args) {
		System.out.println("Enter the fibonacci series to print");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Fibonacci series upto " + number + " numbers");
		for (int i = 1; i <= number; i++) {
			System.out.println(fibonacci(i) + "");
		}

	}

	private static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
