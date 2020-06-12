package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfIntergersStream {

	public static void main(String[] args) {
		/*Convert ArrayList of Integer to Streams */
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(11);
		listOfIntegers.add(12);
		listOfIntegers.add(13);
		Stream<Integer> streamOfInteger = listOfIntegers.stream();
		streamOfInteger.forEach(System.out::println);
		
		                /* ((OR))*/
		/*Convert ArrayList of String to Streams */
		List<String> listOfString=new ArrayList<String>();
		listOfString.add("Bangalore");
		listOfString.add("Hyderabad");
		listOfString.add("Chennai");
		listOfString.add("Mumbai");
		Stream<String>streamOfString=listOfString.stream();
		streamOfString.forEach(System.out::println);
		
		/*Create Stream of Integer*/
		Stream<Integer> streamIntger1=Stream.of(11,12,13);
		                   /*((OR))*/
		Stream<Integer>streamInteger2=Stream.of(new Integer[] {11,12,13});
		streamIntger1.forEach(System.out::println);
		streamInteger2.forEach(System.out::println);
		
		/*Create Stream of String*/
		Stream<String>streamString1=Stream.of("a","b");
		                  /*((OR))*/
		Stream<String>streamString2=Stream.of(new String[] {"a","b"});
		streamString1.forEach(System.out::println);
		streamString2.forEach(System.out::println);
		

	}

}
