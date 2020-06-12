package com.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateAndTimeAPI {

	public static void main(String[] args) {

		/* 1.Examples Of LocalDate */

		System.out.println("**Example Of LocalDate Declaration**");

		LocalDate todayDate = LocalDate.now();
		LocalDate yesterdayDate = todayDate.minusDays(1);
		LocalDate tommorowDate = yesterdayDate.plusDays(2);
		System.out.println("Today Date : " + todayDate);
		System.out.println("YesterDay Date : " + yesterdayDate);
		System.out.println("Tommorow Date : " + tommorowDate);

		System.out.println("**LocalDate Example: isLeapYear()**");

		LocalDate localDate1 = LocalDate.of(2017, 1, 13);
		System.out.println(localDate1.isLeapYear());
		LocalDate localDate2 = LocalDate.of(2016, 9, 23);
		System.out.println(localDate2.isLeapYear());

		System.out.println("**LocalDate Example:atTime()**");

		LocalDate date = LocalDate.of(2020, 6, 01);
		LocalDateTime dateTime = date.atTime(9, 55, 15);
		System.out.println("LocalDate atTime : " + dateTime);

		/* 2.Examples Of LocalDateTime */

		System.out.println("**LocalTime Example: now()**");
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : " + localTime);

		System.out.println("**LocalTime Example: of()**");
		LocalTime localTime2 = LocalTime.of(10, 15, 55);
		System.out.println("LocalTime Of : " + localTime2);
		
		System.out.println("**LocalTime Example: minusHours() and minusMinutes() and plusHours() and plusMinutes()**");
		LocalTime time1=LocalTime.of(10, 15, 55);
		System.out.println("Time1 : " + time1);
		LocalTime time2=time1.minusHours(2); /*or*/ time1.plusHours(4);
		LocalTime time3=time2.minusMinutes(10); /*or*/ time2.plusMinutes(18);
		System.out.println("Time3 " + time3);
		
		/* 3.Example Of LocalDateTime */

		System.out.println("**LocalDateTime Example**");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Before format : " + localDateTime);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dateformat = localDateTime.format(dateTimeFormatter);
		System.out.println("After format : " + dateformat);
		
		System.out.println("** LocalDateTime Example: get()**");
		LocalDateTime getLocalDateTime = LocalDateTime.of(2020, 6, 1, 9, 55);
		System.out.println("Day of Week : " + getLocalDateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println("Day of Year : " + getLocalDateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println("Day of Month : " + getLocalDateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Hours of Day : " + getLocalDateTime.get(ChronoField.HOUR_OF_DAY));
		System.out.println("Minute Of Day : " + getLocalDateTime.get(ChronoField.MINUTE_OF_DAY));
		
		
		
		
		

	}

}
