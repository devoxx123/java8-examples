package com.java8.joeyajames.streams;

import java.time.LocalDateTime;

public class LocalDateTimeComparison {

	public static void main(String[] args) {
		LocalDateTime dateTimeOne = LocalDateTime.parse("2020-05-28T22:32:38.536");
		LocalDateTime dateTimeTwo = LocalDateTime.parse("2019-12-14T15:32:56.000");

		boolean isBefore = dateTimeOne.isBefore(dateTimeTwo);
		System.out.println("dateTimeOne is Before dateTimeTwo : " + isBefore);

		boolean isAfter = dateTimeOne.isAfter(dateTimeTwo);
		System.out.println("dateTimeTwo is After dateTimeOne : " + isAfter);

		boolean isEquals = dateTimeOne.equals(dateTimeTwo);
		System.out.println("dateTimeOne is equals dateTimeTwo : " + isEquals);

	}

}
