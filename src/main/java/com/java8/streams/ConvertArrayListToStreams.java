package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToStreams {

	public static void main(String[] args) {
		List<String> streamList=new ArrayList<String>();
		streamList.add("ank");
		streamList.add("sam");
		streamList.add("az");
		streamList.add("neh");
		streamList.add("ad");
		
		 // In one line display all records that start with 'a' in stringList
		streamList.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);
		
		// In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList
		streamList.stream().filter((s)->s.startsWith("a")).sorted().forEach(System.out::println);
		
		// In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
		streamList.stream().filter((s)->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		
		// In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
		streamList.stream().filter((s)->s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
		
		// In one line count records start with 'a' in stringList
		long countOfRecords=streamList.stream().filter((s)->s.startsWith("a")).count();
		System.out.println("CountOfRecords : " + countOfRecords);
		
		// In one line find whether any record start with 'a' in stringList
		boolean anyMatchRecords=streamList.stream().anyMatch((x)->x.startsWith("s"));
		System.out.println("AnyMatchRecords : " + anyMatchRecords);
		
		// In one line find whether all records start with 'a' in stringList
		boolean allMatchRecords=streamList.stream().allMatch((z)->z.startsWith("a"));
		System.out.println("AllMatchRecords : " + allMatchRecords);
		
		  //In one line find whether none of the records start with 'b' in stringList
		boolean nonMatchRecords=streamList.stream().noneMatch((y)->y.startsWith("b"));
		System.out.println("NonMatchRecords : " + nonMatchRecords );

	}

}
