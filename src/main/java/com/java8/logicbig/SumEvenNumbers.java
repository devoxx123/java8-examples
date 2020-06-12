package com.java8.logicbig;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {

	public static void main(String[] args) {
		List<Integer> sumList=Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		int sum=sumList.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum Of Even Numbers : " + sum);
	}

}
