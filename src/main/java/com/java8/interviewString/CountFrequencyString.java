package com.java8.interviewString;

import java.util.HashMap;
import java.util.Map;

/*How to Count occurrences of each character in a String in java8*/
public class CountFrequencyString {
	public static void main(String[] args) {
		String str = "RADIANT DIGITAL";
		Map<Character, Integer> mapFrqes = new HashMap<>();
		for (char c : str.toCharArray()) {
			mapFrqes.merge(c, 1, Integer::sum);
		}
		System.out.println("Frequencies : " + mapFrqes);
	}

}
