package com.java8.practice;

import java.util.stream.IntStream;

public class FindEvenAndOddNumbers {

	public static void main(String[] args) {
		IntStream.range(1, 5).filter(n -> n % 2 == 0).forEach(System.out::println);
		                    /* (((((OR))))) */
		IntStream.of(1, 2, 3, 4, 5).filter(x -> x % 2 != 0).forEach(System.out::println);

	}

}
