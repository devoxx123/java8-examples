package com.java8.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapByKeyOrValue {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(114, "Prince");
		map.put(990, "Sandeep");
		map.put(201, "Gaurav");
		map.put(406, "Abhinav");
		map.put(299, "Pallavi");

		System.out.println("Unsorted Map");
		System.out.println(map);
		
		System.out.println("Sorted Map(Sorted by Key)");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		/*another way of Sorted by Key or value*/
		
		System.out.println("Sorted Map(Sorted by Key");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
		.forEach(System.out::println);

	}

}
