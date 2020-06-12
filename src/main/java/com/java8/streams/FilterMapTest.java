package com.java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("k1", "101");
		map.put("k2", "50");
		map.put("k10", "13");
		map.put("k4", "20");
		map.put("k3", "109");
		map.put("k8", "78");
		map.put("k22", "81");

		// Map -> Filter -> String
		String mapResult = map.entrySet().stream().filter(e -> "50".equals(e.getValue())).map(e -> e.getValue())
				.collect(Collectors.joining());
		System.out.println("The filtered result : " + mapResult);

		// Map -> Filter -> Map
		Map<String, String> resultMap = map.entrySet().stream().filter(x -> "k10".equals(x.getKey()))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		System.out.println("the filtered map result : " + resultMap);

		// get Key and value
		map.forEach((key, value) -> {
			System.out.println(key);
			System.out.println(value);

		});

	}

}
