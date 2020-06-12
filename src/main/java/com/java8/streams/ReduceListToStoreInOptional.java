package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceListToStoreInOptional {

	public static void main(String[] args) {
		List<String> streamList=new ArrayList<String>();
		streamList.add("MUM");
		streamList.add("Kerala");
		streamList.add("HYD");
		streamList.add("BNG");
		
		Stream<String> reduceList=streamList.stream();
		
		Optional<String>optional=reduceList.sorted().reduce((x1,x2)-> x1 + " " + x2);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		

	}

}
