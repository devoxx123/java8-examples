package com.java8.foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForLoopExternal {

	public static void main(String[] args) {
		List<String> alphabets = Arrays.asList(new String[] { "a", "b", "c", "d" });
		for (String letter : alphabets) {
			System.out.println(letter.toUpperCase());
		}
		Iterator<String> iterator = alphabets.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toUpperCase());
		}

		alphabets.forEach(loop ->System.out.println(loop.toUpperCase()));

	}

}
