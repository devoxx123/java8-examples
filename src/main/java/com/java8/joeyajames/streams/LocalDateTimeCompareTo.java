package com.java8.joeyajames.streams;

import java.time.LocalDateTime;

public class LocalDateTimeCompareTo {

	public static void main(String[] args) {
		LocalDateTime dateTimeOne = LocalDateTime.parse("2020-05-28T22:32:38.536");
		LocalDateTime dateTimeTwo = LocalDateTime.parse("2019-12-14T15:32:56.000");
		int compareValue = dateTimeOne.compareTo(dateTimeTwo);
		System.out.println("Compare Value " + compareValue);
		if (compareValue > 0) {
			System.out.println(dateTimeOne + " is greater than " + dateTimeTwo);
		} else if (compareValue < 0) {
			System.out.println(dateTimeOne + " is less than " + dateTimeTwo);
		} else {
			System.out.println(dateTimeOne + "is equals than " + dateTimeTwo);
		}

	}

}
