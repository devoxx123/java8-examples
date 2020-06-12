package com.java8.practice;

import java.util.stream.IntStream;

public class FindEvenGreaterThan {

	public static void main(String[] args) {
		// Find all even numbers
		IntStream.of(1, 2, 3, 4, 5).filter(x -> x > 2).forEach(System.out::println);

		// Find all even numbers greater than 2
		IntStream.range(1, 5).filter(x -> x > 2).filter(x -> x % 2 == 0).forEach(System.out::println);

	}

}
