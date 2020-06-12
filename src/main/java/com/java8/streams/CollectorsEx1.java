package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx1 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);

		List<Integer> oddNumbers = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println(oddNumbers);
	}

}
