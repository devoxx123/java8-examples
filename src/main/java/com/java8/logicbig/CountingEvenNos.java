package com.java8.logicbig;

import java.util.Arrays;
import java.util.List;

public class CountingEvenNos {

	public static void main(String[] args) {
		List<Integer> evenNos = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		long evenCount = evenNos.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Count Even Numbers : " + evenCount);
		
		evenNos.stream().filter(i->i%2==0).forEach(System.out::println);
	}

}
