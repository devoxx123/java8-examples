package com.java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByKeys {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Apple");
		hmap.put(22, "Orange");
		hmap.put(33, "Kiwi");
		hmap.put(44, "Banana");
		
		/*Map<Integer, String> mapResult = hmap.entrySet().stream().filter(map -> map.getKey().intValue() <= 22)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));*/
		
		                      /*((OR))*/
		
		Map<Integer,String> mapResult=hmap.entrySet().stream().filter(map->"Orange".equals(map.getValue())).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		
		
		
		System.out.println("Result " + mapResult);

	}

}
