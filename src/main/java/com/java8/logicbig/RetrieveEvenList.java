package com.java8.logicbig;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetrieveEvenList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		List<Integer> retrieveEvenList=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("Retrieve Even List : " + retrieveEvenList);
		//list.forEach((s)->System.out.println(s));
		//list.forEach(System.out::println);
		
	}

}
